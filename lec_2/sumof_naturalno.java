package lec_2;
import java.util.*;

public class sumof_naturalno {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);

        System.out.print("Enter no.: ");
        int n = k.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("sum: "+ sum);
    }
}
