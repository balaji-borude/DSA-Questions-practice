
package Basic;

import java.util.HashMap;

/**
 * Array
 */
public class Array {

    // Q1. Find the average of the array element
    public static int AverageOfElement(int arr[]) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        int avg = sum / arr.length;
        return avg;
    }

    // Q2. Multiply each element by 10
    public static int[] MultiplyBy10(int arr[]) {
        int[] newarr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i] * 10;
            // System.out.println(newarr[i]);
        }

        return newarr;
    }

    // Q3. Search for the element in an array
    public static int serachInArray(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Q4. Find the maximum element in an array
    public static int maximumElement(int arr[]) {
        int max = arr[0];
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] > max) {
        //         max = arr[i];
        //     }
        // }

        // using the Math.Max();
        for(int i=0; i<arr.length; i++){
            // System.out.println("Printing the index of math" + i + " value is " + arr[i]);
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    // Q5. Return the sum of +ve and -ve Numbers -- tricky question
    public static int totalSum(int arr[]) {
        int positivesum = 0;
        int NegativeSum =0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0){
                positivesum +=arr[i];
            }else{
                NegativeSum +=arr[i];
            }
        }
        return positivesum;

       

    }

    // Q6. count the number of zeroes and one
    public static void countZeroAndOne(int arr[]) {
        int zeroCount = 0;
        int oneCount = 0;
        for (int i : arr) {
            if (i == 0) {
                zeroCount++;
            } else if (i == 1) {
                oneCount++;
            }
        }
        System.out.println("Zero Count = " + zeroCount);
        System.out.println("One Count = " + oneCount);
    }

    // Q7. find first UnSorted element in an array (Ascending Order )
    public static int unSortedEle(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }


    // Q8 . swap alternate element in an array 
    public static int[] swapAlternateElement(int[] arr){
        int newArr[] = new int[arr.length];

        // two pointer 
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
           newArr[right] = arr[left];
           newArr[left]=arr[right];
           left++;
           right--;
        }

        for(int i:newArr){
            System.out.print(i + " , ");
        }
        return newArr;
    }
    
    //Q9. Print array intersection element // common element in an two arrays 
    public static int[] intersectionElement(int arr1[], int arr2[]){
         int common[]=new int[arr1.length];

         // Brut force 
         for(int i=0; i<arr1.length; i++){

            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    common[j]=arr2[j];
                }
            }
         }

         // optimized but not completed
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int count=0;
        // for(int i=0; i<arr1.length; i++){
        //     map.put(arr1[i], count++);

        // }

        // System.out.println(map);

        System.out.println("printing the common elemene in an array ");
        for(int i:common){
            System.out.println(i);
        }

        return common;
    }
    
    //Q10. Print alternate extreme element of an array 
    public static void PrintAlternate(int arr[]){
        
    }

    //Q11. Reverse an array 
    public static void ReverseAnArray(int[] arr){

        // Approach 1
        // for(int i=arr.length-1 ; i>=0; i--){
        //     System.out.print(arr[i] + " ");
        // }

        // approach 2 -- using temp variable 
        // for(int i=0; i<arr.length; i++){
        //     int temp=arr[i];
        //     arr[i] = arr[]
        // }
        int first=0;
        int last=arr.length-1;
        while(first <=last){
            int temp = arr[first];
            // System.out.println(temp);
            arr[first] = arr[last];
            arr[last]=temp;
            first++;
            last--;
        }


        System.out.println("After reverse an arry print array");
        for(int i:arr){
            System.out.println(i);
        }
    }

    // Q12. Right shift the element by 1 Postion 
    public static int[] RightShiftBy1(int[] arr){
        //int temp=0;

        // From right to left 
        // for(int i=0; i<arr.length-1; i++){
            
        //     arr[arr.length-1];
        //     // temp = arr[i+1];
        //     // arr[i+1] = arr[i];

        // }

        int temp = arr[arr.length-1];

        // from left to right 
        for(int i=arr.length-1; i>0; i--){

            arr[i]=arr[i-1];
        }

        arr[0]= temp;
        return arr;
    }
    

    // Q13. Print Extreme Element in an Alternate Manner
    public static int[] printExtremeEle(int arr[]){

        int[] newArr=new int[arr.length];

        int left=0; 
        int right = arr.length-1;
        int i=0;
        while(left<=right){

            if(left == right){
                newArr[i] = arr[left];
                break;
            }else{

                newArr[i] = arr[left];
                i++;
                left++;
                newArr[i] = arr[right];
                right--;
                i++;
            }
        }



        return newArr;
    }

    // Q14. Identify element with heights and lowest frequency 
    public static int getFrequecy(int arr[]){

        // using hashMap to stored the freq
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            freq.put(arr[i], freq.getOrDefault(arr[i], 0)+1);

        }

        int maxFreq=-1;
        int maxFreqkey;

        for(int key: freq.keySet()){
            int currentKey = key;
            int currentFrequency = freq.get(key);

            if(currentFrequency > maxFreq){
                maxFreq=currentFrequency;
                maxFreqkey=currentKey;

            }
        }
        return maxFreq;
    }


    public static void main(String[] args) { 

        int nums[] = {  5,6,1,3,9,8,8,8,8,8,8    };        
        int nums2[] ={2,5,3,8,9};

        // System.out.println(getFrequecy(nums));
       //int result[]= RightShiftBy1(nums);
       int result[] = printExtremeEle(nums2);
       for(int i:result){
        System.out.print(i + " ");
       }

        //ReverseAnArray(nums2);

        // intersectionElement(nums, nums2);

        // swapAlternateElement(nums);
        

        // System.out.println();

        // int result = AverageOfElement(nums);
        // System.out.println("Average of Result --> " + result);

        // int[] newArr = MultiplyBy10(nums);

        // for (int i : newArr) {
        //     System.out.print(i + " ");
        // };

        System.out.println();
        // int index = serachInArray(nums, 5);
        // System.out.println("serched index is -->" + index);

        // int maxele = maximumElement(nums);
        // System.out.println("max element "+ maxele);

        // int arr[] = { 1, 3, 6, -10, 4, 8, -2, 4 };
        // int totalSum = totalSum(arr);
        // System.out.println("Total sum is -->" + totalSum);

        // int arr1[] = { 1, 0, 0, 1, 3, 5, 0, 1, 1, 1, 0, 1, 0, 10, 0, 1, 1, 1, 1, 1, 0 };
        // countZeroAndOne(arr1);
    }
}