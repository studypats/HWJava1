package HomeWorkApp;

public class HomeWorkApp {

    //Задание 1
    public static boolean sum10to20(int a, int b) {
        if ((a+b>=10)&&(a+b<=20)) return true;
        else  return false;
    }

    //Задание 2
    public static void positiveValue(int a) {
       if (a>=0) System.out.println("\npositive value\n");
       else System.out.println("\nnegative value\n");
    }

    //Задание 3
    public static boolean negativeValue(int a) {
        if (a>=0) return false;
        else return true;
    }

    //Задание 4
    public static void nString(String textLine, int n) {
        for (int i=0; i<n; i++) System.out.println(i+1 + " " +textLine);
    }

    //Задание 5
    public static boolean leapYear(int year) {
        if ((year%400==0)||((year%4==0)&&(year%100!=0))) return true;
        else return false;
    }

    public static void main (String[] args) {
        int a= (int)Math.random();
        int b= (int)Math.random();

        //Задание 1
        //System.out.println(sum10to20(a,b));
        sum10to20(a,b);

        //Задание 2
        positiveValue(a);

        //Задание 3
        //System.out.println(negativeValue(a));
        negativeValue(a);

        //Задание 4
        int n=4;
        String textLine = "ABCD";
        nString(textLine,n);

        //Задание 5
        System.out.println("\n"+leapYear(2000));
        System.out.println(leapYear(2001));
        System.out.println(leapYear(1900));
    }
}
