package Recursion;

import java.io.PrintStream;

public class Recursion {

    // factorial function
    public static int factorial(int num) {
        // base case --> factorial of zero is -> 1
        if(num==0) return 1;

        int result = num * factorial(num-1);
        return result;
    };

    // Print the value from 10 to 1 by recursion
    public static int PrintDec(int num) {
        // base case
        if(num == 1) {
            return 1;
        }
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

    // check array is sorted or not 
    // public static boolean isSorted(int arr[],int i){
    //     if(i == arr.length-1){
    //         return true;
    //     };
    //     if(arr[i] > arr[i+1]){
    //         return false;
    //     };
    //     return isSorted(arr, i+1);
    // }

    // find the first occurancce of the key 
    public static int firstOccurance(int arr[],int key,int i){
        // base case -- where we have to  stop the recurance and key not found case
        if(i == arr.length-1){
            return -1;
        };

        // key found case 
        if(arr[i] == key){
            return i;
        }

        // if key  not found then cal the recursive function 
        return firstOccurance(arr, key, i+1);


    }

    // 26-02-2022 - Practice
    public static void PrintDescresingOrder(int num){
        //base case
        if(num ==1){
            System.out.print(num + " ");
            return;
        };
        System.out.print( num + " ");

        PrintDescresingOrder(num-1);

    };

    public static void PrintIncreasingOrder(int num){
        // base case
        if(num ==1){
            System.out.println(num + " ");
            return;
        };

        PrintIncreasingOrder(num - 1);
        System.out.println(num + " ");
    };

    // check array is Sorted or not 
    public static boolean isSorted(int[] nums, int i){

        // base case
        if(i==nums.length-1) return true;

        if(nums[i] > nums[i+1]){
            return false;
        };

        return isSorted(nums, i+1); // recursivly calling isSorted aray function
       
    }

    // find first Occurence of the element in an array
    public static int FirstOccurance(int[]nums, int key, int i){

        // base case
        if(i==nums.length-1) return -1;

        // fiound case
        if(nums[i]== key) return i;

        return FirstOccurance(nums, key, i+1);

    }

    // find the lastOccurance of element in an array 
    public static int lastOccurance(int[] nums , int key, int i){
        // base case --> if we reach to the last element of an array and not found key then return  
        if( i==nums.length-1) return -1; 

        // first --> check next element 
        int isFound = lastOccurance(nums, key, i+1);

        //jr isFound madhe element bhetla tr return ke
        if(isFound ==-1 && nums[i]==key){
            return i;
        }

        return isFound;
        // if element not found in next then check for self (like in first occurance);
        // if(nums[i]==key) return i;
        

    }


    public static void main(String[] args) {
       
        int num[]={1,2,3,4,5,4,3,2,46,8,5,3,44,66,57};
        //System.out.println(isSorted(num, 0));
        // System.out.println(FirstOccurance(num, 5, 0));
        System.out.println(lastOccurance(num, 5, 0));


    }

}
