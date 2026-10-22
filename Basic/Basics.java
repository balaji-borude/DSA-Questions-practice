package Basic;
class Basics{

    // Q1. Given an integer n, count the total number of digits present in the number.
    public static int countDigit(int num ){
        int count =0; 
        int n = num;
        while(n !=0){
            int lastDigit = n%10;
            System.out.println("LastDigit " + lastDigit);
            count++;
            n = n/10;
        }

        return count;

    }


    // Q2. Given an integer n, reverse its digits. int put n = 1234
    public static int reverseInteger(int num){
        int n=num;
        int reverseNumber=0;
        while(n !=0){
            int lastDigit = n%10;
            reverseNumber = reverseNumber*10 + lastDigit;
            n=n/10;
        }
        return reverseNumber;
    }
    
    //Q3. Given an integer n, check wheather it is a palindrome or not 
    public static boolean checkPalindrome(int num ){
        int n = num;
        int revNum = 0;
        while(n !=0){
            int lastDigit = n%10;
             revNum = revNum *10 +lastDigit;
            n = n/10;


        }
        if(num == revNum){
            return true;
        }

        return false;

    }

    // Q4. Given two integers a and b, find their GCD (Greatest Common Divisor).
    public static int findGCDorHCF(int a, int b){
        while(b!=0){
            int temp = b;
            b=a%b;
            a= temp;
             
        }
        return a;
    }

    public static void main(String[]args){

       int result = countDigit(12345);
       System.out.println("the count is -->"+ result);

       int reverseNum = reverseInteger( 1234);
       System.out.println("Reverse Number is ==> " + reverseNum);

       System.out.println("number is palindrome " + checkPalindrome(121));
        
       System.out.println(" GCD or HCF is  -->" +  findGCDorHCF(12, 18));

    }
}