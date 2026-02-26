package Array;

public class Array {
    // find the largest element in an array
    public static int LargestElement(int arr[]) {

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
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have 2 element ");
        }

        int secondLarge = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        int thirdLarge = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {

                secondLarge = max;
                max = arr[i];

            } else if (arr[i] < max && arr[i] > secondLarge) {
                secondLarge = arr[i];
            }else if(arr[i]<secondLarge && arr[i]>thirdLarge){
                thirdLarge=arr[i];
            }   
        }

        return secondLarge;
    }

    public static void main(String[] args) {
        int arr[] = { 15, 2, 50, 1, 6, 3, 10, 222, 4 };

        // System.out.println( LargestElement(arr));
         System.out.println(SecondLargestElement(arr));

    }
}
