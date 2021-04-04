package HomeWorkApp;

public class HomeWorkApp {

        //Task 5
        public static int[] lenToMas (int len,int initialValue) {
        int[] tempMas= new int[len];
        for (int i=0;i<len;i++) {
            tempMas[i]=initialValue;
            //System.out.print(mas5[i]);
        }
        return tempMas;
        }

        //Task7
        public static boolean checkBallance (int tempMas[]) {
            int sumLeft = 0, sumRight = 0;
            boolean check = false;
            for (int i = 0; i < tempMas.length; i++) {
                sumLeft += tempMas[i];
                sumRight = 0;
                for (int j = i + 1; j < tempMas.length; j++) {
                    sumRight += tempMas[j];
                }
                if (sumLeft == sumRight) {
                    check = true;
                    break;
                }
            }
            //System.out.println("left="+sumLeft+" Right="+sumRight);
            if (check == true) return true;
            else return false;
        }


        //Task8
        public static void ShiftArray (int[] mas, int shift){
            if (shift> mas.length) shift%=mas.length;
            if (shift<0) {
                for (int j=0;j>shift;j--) {leftShift(mas);}
                }
            else {
                for (int j=0;j<shift;j++) {rightShift(mas);}
                }
        }

        public static void rightShift (int[] shiftMas){
            int buf= shiftMas[0];
            shiftMas[0]=shiftMas[shiftMas.length-1];
            for (int i=1;i<(shiftMas.length-1);i++){
                shiftMas[shiftMas.length-i]=shiftMas[shiftMas.length-i-1];
            }
            shiftMas[1]=buf;
        }

        public static void leftShift (int[] shiftMas){
            int buf= shiftMas[shiftMas.length-1];
            shiftMas[shiftMas.length-1]=shiftMas[0];
            for (int i=1;i<(shiftMas.length-1);i++){
                shiftMas[i-1]=shiftMas[i];
            }
            shiftMas[shiftMas.length-2]=buf;
        }


        public static void main (String[] args) {

        int n=10,i=0,j=0;

        //Task 1
        System.out.print("Task 1\n");
        int[] mas1 = new int[n];
        for(i=0;i<mas1.length;i++) {
            mas1[i]=(int)(Math.random()*2);
            System.out.print(mas1[i]);
        }
        System.out.println("");
        for(i=0;i<mas1.length;i++) {
            if (mas1[i]==1) mas1[i]=0;
            else mas1[i]=1;
            System.out.print(mas1[i]);
        }

        //Task 2
        System.out.println("\n\nTask 2");
        int[] mas2 =new int[100];
        for(i=0;i<mas2.length;i++) {
            mas2[i]=i+1;
            System.out.print(mas2[i]+" ");
            }

        //Task 3
        System.out.println("\n\nTask 3");
        int[] mas3=new int[]{1,5,3,2,1,4,5,2,4,8,9,1};
        for (i=0;i<mas3.length;i++) {
            System.out.print(mas3[i]+" ");
            }
        System.out.println("");
        for (i=0;i<mas3.length;i++) {
            if (mas3[i]<6) mas3[i]*=2;
            System.out.print(mas3[i]+" ");
        }

        //Task 4
        System.out.println("\n\nTask 4");
        int[][] mas4=new int[n][n];
        for (j=0;j<n;j++) {
             for (i=0;i<n;i++) {
                if (i==j) mas4[i][j]=1;
                if (j==((n-1)-i)) mas4[i][j]=1;
                System.out.print(mas4[i][j]+ " ");
             }
             System.out.println("");
        }

        //Task 5
        System.out.println("\n\nTask 5");
        int[] mas5=lenToMas(n,5);
        for (i=0;i<n;i++) System.out.print(mas5[i]);

        //Task 6
        System.out.println("\n\nTask 6");
        int[] mas6=new int[n];
        for (i=0;i<n;i++) {
        mas6[i]=(int)(Math.random()*10);
        System.out.print(mas6[i]);
        }
        int min=mas6[0],max=mas6[0];
        for (i=0;i<n;i++) {
            if (mas6[i]<min) min=mas6[i];
            if (mas6[i]>max) max=mas6[i];
        }
        System.out.print("\nmin="+min+" max="+max);

        //Task 7
        System.out.println("\n\nTask 7");
        int[] mas7= new int[]{1,2,3,4,5,5,4,3,2,1};
        System.out.println(checkBallance(mas7));

        //Task 8
        System.out.println("\n\nTask 8");
        int[] mas8= new int[]{1,2,3,4,5,6,7,8};
        int shift=13;
        System.out.println("Shift="+shift+"\nArray");
        ShiftArray(mas8,shift);
        for (i=0;i< mas8.length;i++) System.out.print(mas8[i]);

        }
}


