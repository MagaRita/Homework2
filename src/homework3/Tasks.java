package homework3;

public class Tasks {

    public static void main(String[] args) {

        //Homework 1
        //Task 1
        //Create an array and fill it with 2 number.
        int[] myArray = new int[3];
        myArray[0] = 2;
        myArray[1] = 2;
        myArray[2] = 2;

        //or
        System.out.println("Task 1:");
        System.out.println("Create an array and fill it with 2 number.");
        int[] myArray2 = new int[20];
        for (int i = 0; i < myArray2.length; i++) {
            myArray2[i] = 2;
            System.out.print(myArray2[i] + " ");
        }

        //Task 2
        //Create an array and fill it with numbers from 1:1000.

        System.out.println("\n\nTask 2:");
        System.out.println("Create an array and fill it with numbers from 1:1000.");
        int[] myArray3 = new int[1000];
        for(int i=0;i<myArray3.length;i++) {
            myArray3[i] = i + 1;
            System.out.print(myArray3[i] + " ");
        }

        //Task 3
        //Create an array and fill it with odd numbers from -20:20

        System.out.println("\n\nTask 3:");
        System.out.println("Create an array and fill it with odd numbers from -20:20");

        int k = 0;
        int[] myArray4 = new int[20];
        for(int i=-19; i<myArray4.length;i+=2){
                myArray4[k] = i;
                System.out.print(myArray4[k++] + " ");
        }

        //Homework 2
        //Task 4
        //Create an array and fill it. Print all elements which can be divided by 5.

        System.out.println("\n\nTask 4:");
        System.out.println("Create an array and fill it. ");
        int[] arr = new int[15];
        for(int i=0;i<arr.length;i++){
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nPrint all elements which can be divided by 5.");
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 5 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        //Task 5
        //Create an array and fill it. Print all elements which are between 24.12 and 467.23.

        System.out.println("\n\nTask 5:");
        System.out.println("Create an array and fill it. ");
        double[] arr2 = new double[8];
        for(int i=0;i<arr2.length;i++){
            arr2[i] = 20.5 + i;
            System.out.print(arr2[i] + " ");
        }

        System.out.println("\nPrint all elements which are between 24.12 and 467.23: ");
        for(int i=0;i<arr2.length;i++){
            if(arr2[i] > 24.12 && arr2[i] < 467.23) {
                System.out.print(arr2[i] + " ");
            }
        }

        //Task 6
        //Create an array and fill it. Print count of elements which can be divided by 2.

        System.out.println("\n\nTask 6:");
        System.out.println("Create an array and fill it. ");
        int[] ar = new int[8];
        int count = 0;
        for(int i=0;i<ar.length;i++){
            ar[i] = i + 9;
            System.out.print(ar[i] + " ");
            if(ar[i] % 2 == 0){
                count++;
            }
        }

        System.out.println("\nThe number of elements which can be divided by 2 is: " + count);

        //Homework 3
        //Task 7
        //Given an integer, 0<N<21, print its first 10 multiples.
        //Each multiple N x i (where 0<i<11) should be printed on a new line in the form: N x i = result.

        //input N = 2
        //Output
        //2 x 1 = 2
        //2 x 2 = 4
        //2 x 3 = 6
        //2 x 4 = 8
        //2 x 5 = 10
        //2 x 6 = 12
        //2 x 7 = 14
        //2 x 8 = 16
        //2 x 9 = 18
        //2 x 10 = 20

        System.out.println("\nTask 7:");

        for(int n = 1;n<21;n++){
            for(int i = 1;i<11;i++){
                System.out.println(n + " x " + i + " = " + n*i);
            }
            System.out.println("");
        }
    }
}
