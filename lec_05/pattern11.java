package lec_5;
import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int n =s.nextInt();

        int star=1;
        int space=2*n-3;

        int row=1;

        while (row<=n) {
            int i =1;
            while (i<=star) {
                System.out.print("*");
                i++;
            }
            int j =1;
            while (j<=space) {
                System.out.print(" ");
                j++;
            }
            if (row==n) {
                star--;
            }
            int k =1;
            while (k<=star) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            space-=2;
            star++;
            row++;

        }
    }
}
