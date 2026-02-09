package lec_6;
public class pattern16 {

    public static void main(String[] args) {
        int n = 5;

        int row = 1;
        int star = n-1;
        int space = 1;

        while (row <= 2 * n - 1) {
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            int j = 1; 
            while (j <= space) {
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while (k <= star) {
                System.out.print("* ");
                k++;
            }
            if (row <n) {
                star--;
                space += 2;
            } else {
                star++;
                space -= 2;
            }
            System.out.println();
            row++;

        }
    }
}