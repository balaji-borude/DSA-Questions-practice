package Pattern;

public class pattern {

    // Outer Loop ---> Row
    // Inner low --> column
    public static void main(String[] args) {

        // solid square pattern
        // for(int i=0; i<=3;i++){
        // for(int j=0; j<=3;j++){
        // System.out.print("*" + " ");
        // }
        // System.out.println();
        // }

        // solid rectanlge column
        // for(int i=0; i<=4;i++){
        // for(int j=0; j<=6;j++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Right angle triagle
        // for(int i=0; i<=5; i++){
        // for(int j=0;j<=i;j++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // inverted rignt angle triangle
        int n = 5;
        // for(int row=0; row<=n; row++){
        // for(int col = 0; col<n+1-row; col++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // SOLID PYRAMID COLUMN
        // for(int row =1; row <=n; row++){
        // for(int col = 1; col <=n-row;col++){
        // System.out.print(" ");

        // }
        // // star la print kartoy
        // for(int i=1; i<=row*2-1;i++){
        // System.out.print("*");
        // }
        // System.out.println();
        // };

        // REVERSE PYRAMID COLUMN
        for (int row = n; row >= 1; row--) {

            // spaces (increase)
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // stars (decrease)
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
        

    }
}
