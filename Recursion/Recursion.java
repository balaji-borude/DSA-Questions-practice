package Recursion;

public class Recursion {

    // factorial function
    public static int factorial(int num) {
        // base case
        if (num == 1) {
            return 1;
        }
        int res = num * factorial(num - 1);
        return res;
    };

    // Print the value from 10 to 1 by recursion
    public static void PrintDec(int num) {
        if (num == 1) {
            System.out.print(num + " ");
            return;
        }
        System.out.print(num + " ");
        PrintDec(num - 1);

    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result);

        PrintDec(10);
    }

}
