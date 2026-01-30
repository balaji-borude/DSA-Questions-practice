package Recursion;

import java.io.PrintStream;

public class Recursion {

    // factorial function
    public static int factorial(int num) {
        // base case
        if (num == 0) {
            return 1;
        }
        int res = num * factorial(num - 1);
        return res;
    };

    // Print the value from 10 to 1 by recursion
    public static int PrintDec(int num) {
        // base case
        if(num == 1) {
            return 1;
        }
         // reduction kel --> 

        // number la Print kele + parat function call kele ;
        return num + PrintDec(num);
    }

    // print number from n to 1 in (increaseing order)
    public static void PrintInc(int num){
        if(num ==1){
            System.out.print(1 + " ");
            return;
        }

        PrintInc(num-1);

        System.out.print(num + " ");
    }
    // Fibonacci number --> sum of prev ttwo number eg 2 ==> 1+0;
    public static int Fibonacci(int num) {
        if (num == 0)
            return 0;
        if (num == 1)
            return 1;

        return Fibonacci(num - 1) + Fibonacci(num - 2);
    }

    // sum of n  natural number
    public static int SumOfNaturals(int n){

        if(n==1){
            return 1;
        };

        int res = n + SumOfNaturals(n-1);
        return res;
    }


    public static void main(String[] args) {
        //int result = factorial(5);
        // System.out.println(factorial(5));

        // PrintDec(10);
        //System.out.println(Fibonacci(6));
        /*
         * F(0) = 0
         * F(1) = 1
         * F(2) = 0 + 1 = 1
         * F(3) = 1 + 1 = 2
         * F(4) = 1 + 2 = 3
         * F(5) = 2 + 3 = 5
         * F(6) = 3 + 5 = 8
         */


        // Print increasing order
        // int  num =10;
        // PrintInc(num);

        //sum of naturals 
        System.out.println(SumOfNaturals(5));
    }

}
