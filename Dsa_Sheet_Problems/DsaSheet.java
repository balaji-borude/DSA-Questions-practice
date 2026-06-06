package Dsa_Sheet_Problems;
import java.util.*;
public class DsaSheet {
    
    // Q1. Given an integer n, count the total number of digits present in the number
    public static int Countnumber(int n){
        if(n==1) return 1;
        int num = n;
        int count =0;
        while(num != 0){
            //System.out.println("enete in the loop");
            int lastDigit = num%10;
            num = num /10;
            count++;
        }


        return count;
    }

    //Q2.Reverse a Number 
    public static int ReverseNumber(int n){

        int num =n;
        int reverseNum =0;

        while(num!=0){
            int lastDigit = num % 10;
             num = num/10;
            reverseNum = (reverseNum*10)+lastDigit;
        }

        return reverseNum;
    }

    // Q3.Given an integer n, check whether it is a palindrome.
    public static boolean CheckPalindrome(int n){
        int num = n;
        int reverseNum=0;
        while(num != 0){
            int lastDigit = num%10;
            num = num/10;  // remove last digit 
            reverseNum=(reverseNum*10)+lastDigit;
        };

        if(n == reverseNum){
            return true;
        }

        return false;
    }

    // Q4. Given two integers a and b, find their GCD (Greatest Common Divisor). 
    public static int GCD(int a, int b) {
        int num1 = a;
        int num2 = b;
        
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2; // Get the remainder
            num1 = temp;        // Move the old divisor to num1
        }
        return num1;
    };




    public static void main(String[] args){

        System.out.println("Enter the Number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //System.out.println(Countnumber(n));

        //System.out.println(ReverseNumber(n));

       // System.out.println(CheckPalindrome(n));

       System.out.println(GCD(12, 18));



    }
 
}
