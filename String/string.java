import java.util.*;

import java.util.*;

class string {

    public static void Printletters(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
    //Q1. check no. is palindrome or not
    public static boolean isPalindrome(String str) {

        int n = str.length();
        
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    //Q2. check palindrome using Two - pointer approach
    public static boolean isPalindromeTwoPointerApp(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Q3. find the shortest path (displacement )
    public static double ShortestPath(String path) {
        int x = 0, y = 0;

        // time complexity == > O(n) - linear time
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') {
                y++;
            } else if (path.charAt(i) == 'S') {
                y--;
            } else if (path.charAt(i) == 'E') {
                x++;
            } else {
                x--;
            }

        }

        int x2 = x * x;
        int y2 = y * y;

        return Math.sqrt(x2 + y2);

    }

    // Q4. Substring concept
    public static String PrintSubstring(String str, int si, int ei) {
        String substr = "";

        for (int i = si; i < ei; i++) {
            substr = substr + str.charAt(i);
        }
        return substr;
    }

    // Q5. for a given set of String , Print the Largest string (Lexicographically)
    // (ascending order )

    // .comapreTo() --> function usecase
    // 0 → both strings are exactly equal
    // < 0 → calling string comes before the argument
    // > 0 → calling string comes after the argument

    // System.out.println("Apple".compareTo("Banana")); ---> negative
    // System.out.println("Banana".compareTo("Apple")); ---> positive
    // System.out.println("Apple".compareTo("Apple")); ---> 0

    // why because of ascii value --> 'A' (65) comes before 'B' (66)

    /// compareToIgnoreCase()-->

    public static void LargestString(String fruits[]) {

        String Largest = fruits[0];

        for (int i = 1; i < fruits.length; i++) {
            if (Largest.compareTo(fruits[i]) < 0) {
                Largest = fruits[i];
            }
        }

        System.out.println(Largest);
    }

    // ################## STRING BUILDERS##############

    // StringBuilder is an object Type ,
    // we can convert StringBulder object to string byy using .toString()--> Mehtod
    // we cannot convert int , char into .toString() --> because they are not object
    // ,but we can convert to string Integer,Character Objects

    // eg. int a=4; --> we cant convert --> a.toString --> X
    // eg. but Integer a=8; --> can convert --< a.toString --> true we can covert it
    // , beczz Integer is object
    
    public static String stringBuilder() {
        // crete stringBuilder and assign by Empty string
        StringBuilder sb = new StringBuilder("");

        for (char ch = 'A'; ch < 'Z'; ch++) {
            sb.append(ch);
        }
        return sb.toString();

    }

    // Q6. For a given String convert each first letter of each word to Uppercase
    public static String toUppercase(String str) {
        StringBuilder sb = new StringBuilder("");

        // convert first letter of firsst word to capital
        char ch = Character.toUpperCase(str.charAt(0));

        sb.append(ch); // append the capital letter to sb

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                
                sb.append(str.charAt(i));
                i++;
                
                // space naneter yenarya character la uppercase kaele 
                sb.append(Character.toUpperCase(str.charAt(i)));

            }else{
                // if upper case is not found then --> simply append the chareter 
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();

    }

    //Q7. String Compression ---> Amazon 
    // String str="aaabbcccdd"
    public static String stringCompression(String str){

        StringBuilder newStr = new StringBuilder("");

        for(int i=0; i<str.length();i++){
            int count =1;  //start lach count la--> 1 pakadle karan -> 0 pakadlyave ek kami hotoy 
            while( i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ){
                count++;
                i++;
            };

            newStr.append(str.charAt(i));
            if(count>1){
                newStr.append(count);
            }
        }
        return newStr.toString();
    }
 
    public static void main(String args[]) {
        // get the input
        Scanner sc = new Scanner(System.in);
        //String name = sc.nextLine();

        // Q1. print the letters
        // Printletters(name);

        // Q2. palindrome string --
        // (racecar, noon, madam etc..)

        // String str = "racecar";
        // System.out.println(isPalindrome(str));

        // can we check palindrome no. with two pointer approach
        // System.out.println(isPalindromeTwoPointerApp(str));

        // Q3. given a route containig 4 directions (E,W,N,S) , find the shortest path
        // to reach the destination
        // longest path ---> "WNEENESENNN"

        // square root of (x2-x1)^2 +(y2-Y1)^2

        // String path = "WNEENESENNN";
        // System.out.println(ShortestPath(path));

        // ######## substring #######\

        // String str ="HelloWorld";
        // System.out.println(PrintSubstring(str, 0, 4));

        // there is inbuild mehtod is available in java to get the Substring from string
        // i.e --> .substring()
        // System.out.println(str.substring(0,3));

        String fruits[] = { "Banana", "Peach", "Apple", "Pine", "mango" };
        // LargestString(fruits);

        // calling strin builder function => to print abcd ..z
        // System.out.println(stringBuilder());

        // Q6-> convert first letter to uppercase 
        // String str="hi! my Name is BALAJI";
        // System.out.println(toUppercase(str));


        // Q7. String comprressions
        String str = "aaaabbbccdddz";
        System.out.println("Printitg the String --> "+ str);
        System.out.println(stringCompression(str));

    }
}