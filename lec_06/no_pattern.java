package lec_6;
public class no_pattern {
    public static void main(String[] args) {
        int n =5;

        int row=1;
        int space = n-1;
        int star=1;

        while (row<=n) {
            int i=1;
            while (i<=space) {
                System.out.print(" ");
                i++;
            }
            int j=1;
            while (j<=star) {
                System.out.print(row);
                j++;
            }
            row++;
            star=star+2;
            space--;
            System.out.println();

        }
    }
}




//     1
//    222
//   33333
//  4444444
// 555555555