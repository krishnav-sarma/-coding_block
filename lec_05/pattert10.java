package lec_5;
import java.util.Scanner;

public class pattert10 {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);

        int n=k.nextInt();

        int space=n-1;
        int  star=1;
        int row=1;
        while (row<=n) {
            int i= 1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }
            int j=1;
            while (j<=star) {
                if (j%2==1) {
                    System.out.print(" * ");
                }else{
                    System.out.print("!");
                }
                j++;
            }
            row++;
            space--;
            star=star+2;
            System.out.println();
        }
    }
}


// package lec_5;
// import java.util.Scanner;

// public class pattert10 {
//     public static void main(String[] args) {

//         Scanner k = new Scanner(System.in);
//         int n = k.nextInt();

//         for (int row = 1; row <= n; row++) {

//             // spaces
//             for (int i = 1; i <= n - row; i++) {
//                 System.out.print("  ");
//             }

//             // symbols
//             for (int j = 1; j <= (2 * row - 1); j++) {
//                 if (j % 2 == 1) {
//                     System.out.print(" * ");
//                 } else {
//                     System.out.print(" ! ");
//                 }
//             }

//             System.out.println();
//         }
//     }
// }

