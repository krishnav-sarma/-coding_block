package lec_2;
import java.util.*;

public class max2 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter value for A:");
        int a = k.nextInt();
        System.out.print("Enter value for B:");
        int b = k.nextInt();

        if (a > b) {
            System.out.println("A is max");
        } else {
            System.out.println("B is max");
        }
    }
}
