package HomeWorkApp;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {

    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;

    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static final int delta =SIZE-DOTS_TO_WIN;

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static Scanner sc = new Scanner(System.in);
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while(isCellValid(x, y) == false);
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static Random rand = new Random();
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while(isCellValid(x, y) == false);
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean checkWin(char symb) {
        int count=0;
        for (int j =0; j<SIZE; j++) {
            for (int i=0;i<SIZE; i++){
                if (map[i][j]==symb) {
                    count++;
                    if (count==DOTS_TO_WIN) return true;
                }
                else if(count>0) count=0;
            }
            count=0;
        }
        for (int j =0; j<SIZE; j++) {
            for (int i=0;i<SIZE; i++){
                if (map[j][i]==symb) {
                    count++;
                    if (count==DOTS_TO_WIN) return true;
                }
                else if(count>0) count=0;
            }
            count=0;
        }
        count=0;

// Вот эта конструкция никак не хочет нормально работать, судя по отладчику: "о" не инкриментируется,
// 1 итерация происходит, поэто для условия i=j она может получить победу... поэтому 3 цикла а не 2 и нет масштабируемости
 /*       for (int o=0;o<delta;o++) {
            count=0;
            for (int i = 0; i < SIZE; i++) {
                if (i < SIZE - 1) {
                    int j = i+o;
                    if (map[i][j] == symb) {
                        count++;
                    } else {
                        if (count > 0) count--;
                    }
                    if (count == DOTS_TO_WIN) return true;
               }
            }
        }*/
        count=0;
        for (int i = 0; i < SIZE; i++) {
            int j = i;
            if (map[i][j] == symb) count++;
            else {
                if (count > 0) count--;
            }
            if (count == DOTS_TO_WIN) return true;
        }

        count=0;
        for (int i = 0; i < SIZE - 1; i++) {
            int j = i + 1;
            if (map[i][j] == symb) count++;
            else {
                if (count > 0) count--;
            }
            if (count == DOTS_TO_WIN) return true;
        }

        count=0;
        for (int i = 1; i < SIZE; i++) {
            int j = i - 1;
            if (map[i][j] == symb) count++;
            else {
                if (count > 0) count--;
            }
            if (count == DOTS_TO_WIN) return true;
        }

// та же самая ситуация, 3 цикла вместо 2 и нет масштабируемости
        count=0;
        for (int i = 0; i < SIZE-1; i++) {
            int j = SIZE-i-2;
            if (map[i][j] == symb) count++;
            else {
                if (count > 0) count--;
            }
            if (count == DOTS_TO_WIN) return true;
        }

        count=0;
        for (int i = 0; i < SIZE; i++) {
            int j = SIZE-i-1;
            if (map[i][j] == symb) count++;
            else {
                if (count > 0) count--;
            }
            if (count == DOTS_TO_WIN) return true;
        }

        count=0;
        for (int i = 1; i < SIZE; i++) {
            int j = SIZE-i;
            if (map[i][j] == symb) count++;
            else {
                if (count > 0) count--;
            }
            if (count == DOTS_TO_WIN) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

}
