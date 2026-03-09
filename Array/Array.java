package Array;

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

    //

    public static int DigitalRoot(int num) {
        // int num = 157; sum = 13 ==> 4

        int sum = 0;
        while (num >= 10) {
            sum = 0;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            ;

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

    public static void main(String[] args) {
        int arr[] = { 15, 0, 50, 0, 6, 0, 10, 222, 4 };

        // System.out.println( LargestElement(arr));
        // System.out.println(SecondLargestElement(arr));
        Scanner sc = new Scanner(System.in);
        // int input = sc.nextInt();
        // System.out.println(DigitalRoot(input));

        int nums[]={ 1,2,3,4,6};
        System.out.println(CheckArray(nums));
    }
}
