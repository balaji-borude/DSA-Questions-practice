package Array;

import java.util.Scanner;

public class Interview {

    public static void findLargeAndSecondLarge() {
        System.out.println("Find the maximum element in the array");

        Scanner sc = new Scanner(System.in);

        System.out.println("Take size of an array");
        int n = sc.nextInt();

        int[] arr = new int[n]; // create an array of size n

        System.out.println("Enter the Element in an array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ;

        // Priting the all array
        System.out.println("Printing the all array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        ;

        // find the largest element from an arrayy
        int max = arr[0];
        int secondLarge = Integer.MIN_VALUE;

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] > max) {
        //         max = arr[i];
        //     }

        // }

        // for (int j = 0; j < arr.length; j++) {
        //     if (arr[j] > secondLarge && arr[j] != max) {
        //         secondLarge = arr[j];
        //     }
        // }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondLarge=max;
                max=arr[i];
            }else if(arr[i]<max && arr[i]<secondLarge){
                secondLarge=arr[i];
            }
        }

        System.out.println("Max element from array is -->  " + max);
        System.out.println("The second large is -->  " + secondLarge);
    }

    public static void findSmallest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of an array");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ;

        // find the smallest element of an array
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        ;

        System.out.println("Smallest Element is => " + smallest);

    }

    public static void reverseArray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        int arr[] = new int[n];

    }

    public static void main(String str[]) {

        // find large and second large
        findLargeAndSecondLarge();

        // find the smallest element
        // findSmallest();

        // Reverse an array
        //reverseArray();
    }
}
