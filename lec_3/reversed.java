package lec_3;
import java.util.*;;
public class reversed {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("enter no. ");
        int n= k.nextInt();

        int r=0;

        while (n>0) {
            int digit=n%10;
            r=r*10+digit;
            n=n/10;
        }
        System.out.println("reversed no. "+r);


    }
}
