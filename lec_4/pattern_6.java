package lec_4;
import java.util.*;

public class pattern_6 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("enter value n: ");
        int n = k.nextInt();

        int r = 1;
        int sp = 1;
        int st = 1; 


        for(int i=0; i<=n;i++){
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }for (int j = 0; j < st; j++) {
                System.out.print(" *");
            }
            System.out.println();
            st++;
            r++;
            sp=sp+2;
        }
    }
}        