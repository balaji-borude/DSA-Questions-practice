package nqt;
import java.util.*;
class NQT {

    // find the largest and secondLargest element
    public static int largest(int nums[]) {

        int large=Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for(int i=0; i<nums.length;i++){
            if(nums[i]>large){
                secondLarge=large;
                large=nums[i];
            } else if(nums[i] > secondLarge && nums[i] != large){
                secondLarge=nums[i];
            }
        };

        // for(int j=0; j<nums.length;j++){
        //     if(nums[j]>secondLarge && nums[j] !=large ){
        //         secondLarge=nums[j];
        //         System.out.println(secondLarge);
        //     }
        // }

        return secondLarge;
    };

    //reverse an array -->  int nums[] = { 11, 12,  15, 44, 1, 54 };
    
    public static void reverseArray(int nums[]){

        // Brutforce approach
        // int arr[] =  new int[6];
        // int n = nums.length-1;
        // for(int i=n; i>=0; i--){
        //     arr[i]=nums[i];
        //     //System.out.println(nums[i]);
        // }
        // int large=Integer.MIN_VALUE;
        // for(int num:arr){
        //     System.out.println(num);
        //     if(num>large){
        //         large=num;
        //     }
        // };

        // Optimal Solutions 
        int start =0;
        int end = nums.length-1;

        while(start<end){

            int temp = nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            
            start++;
            end--;

        };

        // print reverse array 
        for(int i=0; i<nums.length;i++){
            System.out.println(nums[i]);
        }

    }


    public static void main(String[] args) {

        // Method 1-> declared array
        int arr[] = new int[5];
            arr[0] = 2;
            arr[1] = 4;
            arr[2] = 3;
            arr[3] = 5;
        // Method 2-> array declaration
        // int result = largest(nums);
        // System.out.println(result);

        int nums[] = { 11, 12,  15, 44, 1, 54 };
        // array reverse
        reverseArray(nums);
    }
}