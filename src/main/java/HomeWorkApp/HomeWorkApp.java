package HomeWorkApp;

public class HomeWorkApp {

    public static void printThreeWords() {
        System.out.println("_Orange \n" + "_Banana \n" + "_Apple \n");
    }

    public static void checkSumSign() {
        int a= (int)Math.random();
        int b= (int)Math.random();
        if (a+b>=0) System.out.println("Сумма положительная \n");
        else  System.out.println("Сумма отрицательная \n");
    }

    public static void printColor() {
        int value= (int)Math.random();
        if (value<=0) System.out.println("Красный \n");
        if ((value>0) && (value<=100)) System.out.println("Желтый \n");
        if (value>100) System.out.println("Зеленый \n");
    }
    public static void compareNumbers() {
        int a= (int)Math.random();
        int b= (int)Math.random();
        if (a>=b) System.out.println("a>=b");
        else System.out.println("a<b");
    }
    public static void main (String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
}
