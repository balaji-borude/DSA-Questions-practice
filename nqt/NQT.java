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
        int arr[] =  new int[6];
        int n = nums.length-1;

        for(int i=n; i>=0; i--){
            arr[i]=nums[i];
            //System.out.println(nums[i]);
        }
        int large=Integer.MIN_VALUE;
        for(int num:arr){
            System.out.println(num);
            if(num>large){
                large=num;
            } 
        };

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

    public static void subArrays(int arr[]){

        for(int i=0; i<arr.length-1;i++){
            for(int j=i; j<arr.length-1;j++){
                for(int k =i; k<=j;k++){
                    System.out.print( " "+ arr[k] + " ");

                }
                System.out.println();
            }
        }
    }

    // Given an array of size n, count the total number of possible subarrays.
    public static int subArrayTotal(int arr[]){
        // optimal way to count total subarray
        // int n=arr.length;
        // int total = n*(n+1)/2;
        // return total;
        int count =0;
        for(int i=0; i<arr.length;i++){
            for(int j=i; j<arr.length;j++){
                count++;
            }
        }
        return count;
    }


    // max subarray sum 
    public static int subarraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length;i++){
            for(int j=i; j<arr.length; j++){
                int sum=0;
                for(int k=i; k<=j; k++){
                    sum = sum+ arr[k];
                }

                maxSum = Math.max(sum,maxSum);
            }
        };

        return maxSum;
    }



    public static void main(String[] args) {

        // Method 1-> declared array
        // int arr[] = new int[5];
        //     arr[0] = 2;
        //     arr[1] = 4;
        //     arr[2] = 3;
        //     arr[3] = 5;
        // Method 2-> array declaration
        // int result = largest(nums);
        // System.out.println(result);

        // int nums[] = { 11, 12,  15, 44, 1, 54 };
        // Scanner sc = new Scanner(System.in);
        
        // Scanner sc = new Scanner(System.in);
        // int arr[]= new int[5];

        // // System.out.println("Give input to array");
        // for(int i=0; i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // };
        
        // for(int i=0; i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        // array reverse
        // reverseArray(nums);
       

        // subArrays Problems 
        //int arr[]={1,2,3};
        //subArrays( arr);
        // int result =subArrayTotal(arr);
        // System.out.println(result);

        // int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        // int result = subarraySum(arr);
        // System.out.println(result);


        Scanner sc = new Scanner(System.in);

        String [] input = sc.nextLine().split(" ");

        int arr[]= new int[input.length];

        for(int i=0; i<input.length;i++){
            arr[i]=Integer.parseInt(input[i]);
        };

        System.out.println(Arrays.toString(arr));
        
    }
}