package lec_6;
public class pattern_with_count {
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
            int count=1;
            while (j<=star) {
                System.out.print(count);
                j++;
                count++;
            }
            row++;
            star=star+2;
            space--;
            System.out.println();

        }
    }
}




//     1
//    123
//   12345
//  1234567
// 123456789