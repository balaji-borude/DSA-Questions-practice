package Home_work;

import java.util.Scanner;

public class homework {


    // print counting from 1 to n 
    public static void counting(int n){
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    };

    //2. printing count from n to 1
    public static void reverseCounting(int n){

        for(int i=n; i>=1; i--){
            System.out.println(i);
        }
    };

    // print the 10 multiples of n
    public static void multipleOfN(int n){
        for(int i=1; i<=10;i++){
            System.out.println(n * i);
        }
    }

    // print your name 1oo times
    public static void printName(){
        for(int i=1; i<=100;i++){
            System.out.println("Balaji" + i);
        }
    }

    // print all prime number from 1 to 100
    public static void printPrime(){
        for(int i=2; i<=100; i++){
            boolean isPrime = true;

            for(int j=2; j<= Math.sqrt(i); j++){

                if(i%j ==0){
                    isPrime = false;
                    break;
                }
                
            };
            
            if(isPrime){
                System.out.println(i);
            }

        }
    }

    // print all even number from 1 to 100;
    public static void printEven(){
        for(int i=1; i<=100;i++){
            if(i%2==0) {
                System.out.println(i);
            }
        };

        System.out.println("Printing odd");
        for(int i=0; i<=100;i++){
            if(i%2!=0) System.out.println(i);
        }
    }

    // print sum of the  all the numbers from 1 to n
    public static void sumOfNumbers(int n){
        int sum =0;
        for(int i=0; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("Total sum is -->  " + sum);
    }

    // print all integer in range from 50 to 100  that are perfectly divisible by 7;
    public static void divisibleOf7(){
        for(int i=50; i<=100;i++){
            if(i%7==0) System.out.println(i);
        }
    }

    public static void main(String [] args){
        System.out.println("Working on the homework screenshot by Love Babbar");
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the count ");
       int num = sc.nextInt();

        //counting(num);
        //reverseCounting(num);
        // multipleOfN(num);
        //printName();
        //printPrime();
        //printEven();
        //sumOfNumbers(num);
        divisibleOf7();

    }
}
