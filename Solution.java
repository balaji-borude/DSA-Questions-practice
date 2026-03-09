class Solution {
    
    public static boolean isPalindrome(String s) {

        // int n = s.length();
        // for (int i = 0; i < n / 2; i++) {
        //     if (s.charAt(i) != s.charAt(n - 1 - i)) {
        //         return false;
        //     }
        // }
        // return true;

        //.isLetterOrDigit() --> remove all the alphanumeric chareacter ;
        //.Charecter.toLowecase() --> convert all the char to lowercase

        // aplying Two pointer approach 
        String str = s.replaceAll("[^a-zA-Z0-9]", ""); // remove all the alphnumeric charectrer from string 

        int start = 0;
        int end = str.length();

        while (start < end) {
            if (Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end - 1))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    };

    // print n to 1 
    public static void Printdecending(int num){
        for(int i=num; i>=1; i--){
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        String s= "A man, a plan, a canal: Panama";
       //System.out.println( isPalindrome(s));

       Printdecending(10);
    }
}