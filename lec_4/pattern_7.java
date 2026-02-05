package lec_4;
import java.util.*;

public class pattern_7 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("enter value n: ");
        int n = k.nextInt();

    
        for(int i=0; i<=n;i++){
            for (int j = 0; j <=n; j++) {
                if (i==0||j==0||i==n||j==n) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}        