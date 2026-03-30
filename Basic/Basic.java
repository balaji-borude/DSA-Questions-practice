package Basic;

import java.util.Scanner;

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

    // Two sum variation.
    // Find duplicate efficiently.
    // • Two Sum (brute + idea of hashmap)
    // • Reverse words
    // • Palindrome string
    // • Max element
    // • Remove duplicates

    // take 2 input multiply them and return the result
    public static int multiply(int a , int b){
        int result;
        result = a*b;
        return result;
    };

    public static int PrintPerimeterOfTriangle(int length , int breadth, int height){

        int perimeter;
        perimeter = length + breadth + height;
        return perimeter;
    }

    public static int PrintCount(int n){
        int count =0;

        for(int i=n; i<=5; i--){
            if(i==1){
                return count + 1;
            }
            count = count + 1;

        };

        return count;
    }

    public static int factorial(int num){
        
        int fact=1;
        // int product;
        if(num ==1){
            return 1;
        };
        
        for(int i = num; i<=num; i--){
            if(i==1) return fact; // stoping condition zali 
            fact = fact * i;

        }

        return fact;
    }

    public static boolean IsPrime(int num){
        // corner case
        if(num <=1) return false;

        for(int i=2; i<=num/2; i++){
            if(num % i==0) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "  the   sky is   blue ";
        System.out.println(reverseString(input)); // blue is sky the

        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        //multiply(int a, int b);
        //System.out.println("The result of multiplication is  " + multiply( a,b));

        // int length = sc.nextInt();
        // int breadth = sc.nextInt();
        // int height = sc.nextInt();
        // System.out.println("The Perimeter of th Triangle is  " + PrintPerimeterOfTriangle(length, breadth, height));

        // int n = sc.nextInt();
        // System.out.println("the Counting from n to 1 is  " + PrintCount(n));


        // factorial
        // int num = sc.nextInt();
        // System.out.println("Factorial of " + num + " is " + factorial(num));

        int num = sc.nextInt();
        System.out.println(IsPrime(num));

    }
}
