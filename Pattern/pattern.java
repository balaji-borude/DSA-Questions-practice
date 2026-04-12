package Pattern;

public class pattern {

    public static void main(String[] args) {
        
        // solid square pattern 
        // for(int i=0; i<=3;i++){
        //     for(int j=0; j<=3;j++){
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println();
        // }


        // solid rectanlge column 
        // for(int i=0; i<=4;i++){
        //     for(int j=0; j<=6;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // Right angle triagle 
        for(int i=0; i<=5; i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
