package Basic;

public class Basic {

    // check no. is even or odd
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            while (nums[i] != 0) {

                int lastDigit = nums[i] % 10;
                int removeLastDigit = nums[i] / 10;
                count++;

                if (count % 2 == 0) {
                    evenCount++;
                }
            }

        }
        return evenCount;
    }

    //Reverse words in string.
    public static String reverseString(String str){
        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();

        int i = str.length() - 1;
        // System.out.println("length of the str: " + i);

        while( i>=0){
            // skip spaces --> jr space asel tr -> next position la jaa
            while(i >= 0 && str.charAt(i)== ' '){
                i--;
            };

            // jr space nasel tr --> collect charecter of one word
            while(i >= 0 && str.charAt(i) != ' '){
                word.append(str.charAt(i));
                i--;
            };

            // if word found reverse it back and add to result 
            if(word.length() > 0){
                word.reverse();
                result.append(word).append(" "); //.append(" ")
                word.setLength(0);
            }

        };
        return result.toString();

        
    }

    // “Two sum variation.”
// “Find duplicate efficiently.”
// • Two Sum (brute + idea of hashmap)
// • Reverse words
// • Palindrome string
// • Max element
// • Remove duplicates
    public static void main(String[] args) {

        String input = "  the   sky is   blue ";
        System.out.println(reverseString(input)); // blue is sky the
    }
}
