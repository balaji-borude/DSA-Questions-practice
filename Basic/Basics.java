package Basic;

public class Basics {
    
    public static void main(String[] args) {

       // Learning Integer
        int arr[];
        String arr1[]={"balaji","Borude"};
        int arr2[]=new int[5];
        arr2[0]=10;
        arr2[1]=20;
        arr2[2]=30;

        for(int i : arr2){
            System.out.println(i);
        }
        System.out.println(arr2[2]);


        // Learning String

        String str = "I am learning Java";
        String name = "Balaji";
        String str2 = "Love";

        // System.out.println(name.length());
        // System.out.println(name.charAt(1));

        // .contains();  --> if string contain charecter of sequence then it return true, otherwise false
        //boolean result = str.contains("Java");
        //System.out.println(result);

        //System.out.println(name.contains("ala"));

        // .substring() -->
        //System.out.println(str.substring(1,18));

        //System.out.println(str.toUpperCase());


        // .split(regex) --> split by using spaces , comma , or .
        // always retrun a array
        // String fruits = "apple,banana,mango";

        // String[] arr = fruits.split(",");   // Split on the basic of --> " , "

        // for(String items : arr){
        //     System.out.println(items);
        // };



    }
}
