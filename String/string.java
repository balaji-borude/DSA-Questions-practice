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
    public static void main(String args[]) {
        System.out.println("hellow world");

        // get the input
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        // Q1. print the letters
        // Printletters(name);

        // Q2. palindrome string --
        // (racecar, noon, madam etc..)

        String str = "racecar";
        //System.out.println(isPalindrome(str));

        // can we check palindrome no. with two pointer approach 
        System.out.println(isPalindromeTwoPointerApp(str));
    }
}