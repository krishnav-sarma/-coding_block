package lec_6;
public class rirror1 {
    public static void main(String[] args) {
        int n = 5;

        int row = 2*n-1;
        int star = 0;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            if (i < n) {
                star++;
            } else {
                star--;
            }
            System.out.println();
        }

        // for (int i = 0; i <=n; i++) {
        // for (int j = n; j >=i; j--) {
        // System.out.print("* ");
        // }System.out.println();
        // }

    }
}
