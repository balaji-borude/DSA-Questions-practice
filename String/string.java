import java.util.*;

class string {

    public static void Printletters(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }

    // check no. is palindrome or not
    public static boolean isPalindrome(String str) {

        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // check palindrome using Two - pointer approach 
    public static boolean isPalindromeTwoPointerApp(String str){
        int start = 0;
        int end = str.length()-1;

        while(start<end){

            if(str.charAt(start)!= str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    // Q3. find the shortest path (displacement )
    public static double ShortestPath(String path){
        int x=0,y=0;

        // time complexity == > O(n) - linear time 
        for(int i=0; i<path.length();i++){
            if(path.charAt(i)=='N'){
                y++;
            }
            else if(path.charAt(i)=='S'){
                y--;
            }
            else if(path.charAt(i)=='E'){
                x++;
            }
            else{
                x--;
            }

        }

        int x2 = x*x;
        int y2= y*y;

        return  Math.sqrt(x2 + y2);


    }


    //Q4. 
    public static String  PrintSubstring(String str, int si, int ei){
        String substr = "";

        for(int i=si; i<ei; i++){
            substr = substr + str.charAt(i);
        }
        return substr;
    }

    public static void main(String args[]) {
        System.out.println("hellow world");

        // get the input
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        // Q1. print the letters
        // Printletters(name);

        // Q2. palindrome string --
        // (racecar, noon, madam etc..)

        //String str = "racecar";
        //System.out.println(isPalindrome(str));

        // can we check palindrome no. with two pointer approach 
        // System.out.println(isPalindromeTwoPointerApp(str));


        // Q3. given  a route containig 4 directions (E,W,N,S) , find the shortest path to reach the destination 
        //longest path --->  "WNEENESENNN"

        // square root of (x2-x1)^2 +(y2-Y1)^2

        String path = "WNEENESENNN";
        System.out.println(ShortestPath(path));


        //######## substring #######\

        String str ="HelloWorld";
        System.out.println(PrintSubstring(str, 0, 4));


        // there is inbuild mehtod is available in java to get the Substring from string i.e --> .substring()

        System.out.println(str.substring(0,3));

    }
}