package sorting;

public class sorting{

    public static void BubbleSort(int arr[]){
        for(int i=0; i<arr.length;i++){

            for(int j=0; j<arr.length-1; j++){

                if(arr[i] > arr[j+1]){
                    // swap karayche 
                    int temp = arr[i];
                    arr[i]=arr[j+1];
                    arr[j+1] = temp;
  
                }
            }

            
        }
        
        System.out.println("Array sort zala ");
            for(int num : arr){
                System.out.print( num );
            }
    }

    // selection sort  --> Pick the smallest from (unsorted) , put it at the begining;
    public static void selectionSort(int arr[]){
        
    }


    public static void main(String[] args){

        //Bubble sort  --> largest element come to the end of an array by swapping with the adjacent element 

        int arr[]={2,8,9,3,4,6};
        BubbleSort(arr);

    }
    
}