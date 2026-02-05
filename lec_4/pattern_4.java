package lec_4;
import java.util.*;

public class pattern_4 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("enter value n: ");
        int n = k.nextInt();

        // for loop
        int r = 1;
        int sp = n - 1;
        int st = 1;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < sp; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < st; j++) {
                System.out.print(" *");
            }
            System.out.println();
            st++;
            r++;
            sp--;
        }

        System.out.println();
        System.out.println();
        System.out.println();

        //while loop

        int row = 1;
        int space =n-1;
        int star=1;

        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            row++;
            space--;
            star++;
            System.out.println();

        }
    }
}
