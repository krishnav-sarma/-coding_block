package lec_5;
public class HDpattern13 {
    public static void main(String[] args) {
        int n=5;

        int star=1;
        int space=2*n-3;
        for (int row = 0; row < n; row++) {
            for (int i = n; i < n; i++) {
                System.out.print("* ");
            }
            for (int i = 0; i < n; i++) {
                System.out.print("  ");
            }
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }

        }

        System.out.println();
        space++;
        star++;
        
    }
}
