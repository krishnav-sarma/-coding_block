package lec_2;
import java.util.*;

public class maxofthree {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter value for A:");
        int a = k.nextInt();
        System.out.print("Enter value for B:");
        int b = k.nextInt();
        System.out.print("Enter value for C:");
        int c = k.nextInt();

        if (a > b && a>c) {
            System.out.println("A is max");
        } else if (b>a && b>c) {
            System.out.println("B is max");
        } else {
            System.out.println("C is max");
        }
    }
}
