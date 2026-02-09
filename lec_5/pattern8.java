package lec_5;
import java.util.Scanner;

public class pattern8 {

    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);

        int n=k.nextInt();


        // while
        int space=0;
        int  star=2*n-1;
        int row=1;
        // while (row<=n) {
        //     int i= 1;
        //     while (i<=space) {
        //         System.out.print(" ");
        //         i++;
        //     }
        //     int j=1;
        //     while (j<=star) {
        //         System.out.print("*");
        //         j++;
        //     }
        //     row++;
        //     space++;
        //     star-=2;
        //     System.out.println();
        // }

        
        //for
        for ( row = 1; row <=n; row++) {
            for (int j = 1; j <=space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=star; j++) {
                System.out.print("*");
            }
        space++;
        star-=2;
        System.out.println();    
        }
    }
    
}