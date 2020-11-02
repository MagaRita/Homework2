package picsart.homework2;

public class Operations {
    public static void main(String[] args) {

        int numberOfElements, $currency, _type1;
        int num1 = 10, num2 = 20;
        int sum = num1 + num2;
        int mult = num1 * num2;
        int sub = num2 - num1;
        int mod = num2 % num1;
        int div = num2 / num1;

        System.out.println("num1 + num2 = " + sum);
        System.out.println("num1 * num2 = " + mult);
        System.out.println("num2 - num1 = " + sub);
        System.out.println("num2 % num1 = " + mod);
        System.out.println("num2 / num1 = " + div);

        int num3 = 4;
        double num4 = 6.0;
        System.out.println("num4 / num3 = " + 6.0/4 + "\n");

        System.out.println("num1 value is: " + num1++);
        int num5 = num1-- + ++num2;
        System.out.println("num5 value is: " + num5);
        System.out.println("num1 value is: " + num1);
        System.out.println("num2 value is: " + num2 + "\n");

        int a = 4, b = 7;
        int c = a++ - --b;
        System.out.println("c = " + c--);
        System.out.println("a = " + ++a);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c + "\n");

        boolean temp = a == 5;
        System.out.println("a = 5 is " + temp);
        System.out.println("a != 6 is " + (a != 6));
        System.out.println(a > 24);
        System.out.println(a < 24);
        System.out.println(a <= 20);

        boolean p = a >= 0 && a <= 10;
        System.out.println("p is " + p);

        System.out.println(a< 10 || a % 15 == 0);
        System.out.println(a< 10 || a % 15 == 0 && a > 5);

        System.out.println(!(a< 10 || a % 15 == 0));
        System.out.println("p is " + !p);

        int d = 8;
        d = d + 2;
        d += 2;
        d = d % 4;
        d %= 4;

        System.out.println("\nThe Bitwise Operations:");
        System.out.println("60 & 13 = " + (60&13));
        System.out.println("60 | 13 = " + (60|13));
        System.out.println("60 ^ 13 = " + (60^13));
        System.out.println("60 >>> 2 = " + (60 >>> 2));
        System.out.println("~60 = " + ~60);
        System.out.println("60 << 2 = " + (60 << 2));
        System.out.println("60 >> 2 = " + (60 >> 2) + "\n");

        System.out.println("5 & 12 is: " + (5 & 12));
        System.out.println("60 | 13 is: " + (60 | 13));
        System.out.println("2 ^ 5 is: " + (2 ^ 5) + "\n");

        int[] array = new int[4];
        array[0] = 4;
        array[1] = 6;
        array[2] = 0;
        array[3] = 8;

        int s = 4;
        int[] myArray = new int[5];
        myArray[0] = s++;
        System.out.println("The first element value in the array is: " + myArray[0]);
        System.out.println("Second element value in the array is: " + myArray[1]);
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length-1]);

        double[] doubleArray = {1.2, 32.4};
//        double[] doubleArray = new double[2];
//        doubleArray[0] = 1.2;
//        doubleArray[1] = 32.4;
        double[] doubleArray2 = new double[]{1.2, 32.4};

        short xx = 4;
        int[][] arr = {{xx,6}, {62, 44}};
        System.out.println(arr[1][0]);

        if(xx > 0){
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

        int yy = xx > 0 ? 0 : 1;
        System.out.println("The value of yy is: " + yy);

        System.out.println(xx > 0 ? "positive" : "not positive");

        System.out.println(xx > 0 ? "positive" : xx < 0 ? "negative" : "zero");

        if(num1 > 10){
            System.out.println("\nThe number is bigger than 10.");
        } else {
            System.out.println("\nThe number is equal to or less than 10.");
        }

        if(num5 == 32 && num2 == 21){
            if(num1 > 10){
                System.out.println("num1>10, num2=21, num5=32");
            } else {
                System.out.println("num1<=10, num2=21, num5=32");
            }
        }

        if(num5 ==32 || num2 == 20){
            System.out.println("Either one of the logical operations is correct or both of them are correct.");
        }

        if(!(num2 == 20)){
            System.out.println("num2 != 20");
        }

        int x = 6;
        System.out.println(x<6?"smaller than 6":x==6?"x is 6":"bigger than 6");

        xx = 3;

        switch (xx){
            default:
                System.out.println("meca");
                break;
            case 1:
                System.out.println("mek");
                break;
            case 3:
                System.out.println("ereq");
                break;
            case 2:
                System.out.println("erku");
                break;
            case 4:
            case 5:
                System.out.println("normal");
        }
    }
}
