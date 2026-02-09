package lec_5;
import java.util.Scanner;

public class pattern7 {

    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);

        int n=k.nextInt();

        int space=n-1;
        int  star=1;
        int row=1;
        while (row<=n) {
            int i= 1;
            while (i<=space) {
                System.out.print(" ");
                i++;
            }
            int j=1;
            while (j<=star) {
                System.out.print("*");
                j++;
            }
            row++;
            space--;
            star=star+2;
            System.out.println();
        }

    }
    
}