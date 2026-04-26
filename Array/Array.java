

import java.util.*;

public class Array {

    // find the largest element in an array
    public static int LargestElement(int arr[]) {
        if (arr == null || arr.length <= 0)
            return -1;

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            ;
        }

        return max;
    }

    // find the second largestElement in an array (Without sorting)
    public static int SecondLargestElement(int arr[]) {

        // corner case
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have 2 element ");
        }

        int secondLarge = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        // int thirdLarge = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                secondLarge = max;
                max = arr[i];

            } else if (arr[i] < max && arr[i] > secondLarge) {
                secondLarge = arr[i];
            }
        }

        return secondLarge;
    }

    //digital Root --> Keep adding the digits of a number again and again until you get a single digit (0–9).
    public static int DigitalRoot(int num) {
        // int num = 157; sum = 13 ==> 4

        int sum = 0;
        while (num >= 10) {
            sum = 0;
            while (num > 0) {
                sum = sum + num % 10;
                num = num / 10;
            };
            num = sum;
        }
        return sum;

    
    }
    

    // check given array is sorted or not
    public static boolean CheckArray(int[] nums) {
        // corner case
        if(nums==null || nums.length<=1){
            return true; // because empty and single value array is sorted
        };

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        ;
        return true;
    }

    // find the smallest Number from array 
    public static int smallestElement(int arr[]){

        int smallest = Integer.MAX_VALUE;
        for(int num : arr){
            if(num<smallest ){
                smallest=num;
            }
        }
        return smallest;
    }


    public static void main(String[] args) {
        int arr[] = { 15, 3, 50,  6, 10, 222, 4 };

        // System.out.println( LargestElement(arr));
        // System.out.println(SecondLargestElement(arr));
        // Scanner sc = new Scanner(System.in);
        //  int input = sc.nextInt();
        // System.out.println(DigitalRoot(input));

        // int nums[]={ 1,2,3,4,6};
        // System.out.println(CheckArray(nums));

        // int n = arr.length;

        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i] +" ");
        // }

       //System.out.println( smallestElement(arr));


       // 2 d Array 
        
       // declaration;
         //int matrix[][];

       // Initialization
       int matrix1[][] = new int[3][3];

       //give value to matrix array
        
        int matrix[][] = {
            {1,2},
            {3,4},
            {5,6}
        };

       // Printing the matrix 
       for(int row = 0; row < matrix.length; row++){
        for(int col =0; col< matrix[0].length;col++){
            System.out.print(matrix[row][col] + " ");
        }
        System.out.println();
       }


       // if the array column are different --> Jacked array 
        int matrix2[][] = {
            {1,2},
            {3,4,5,6,7},
            {8,9,10},
            {11,12,13,14,15,16}
        };
         
        // calculate row and column length 
        int rowLength = matrix2.length;

        //int columnLength = matrix2[0].length; // when there is same column in all array the use this 

        // if array columnLength length is differe then do these 

        for(int row =0; row<rowLength; row++){

            int columnLength = matrix2[row].length;
            for(int col =0; col<columnLength; col++){
                System.out.print(matrix2[row][col]+ "   ");
            }
            System.out.println();
        }
   
    }
}
