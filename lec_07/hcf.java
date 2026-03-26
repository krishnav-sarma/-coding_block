package lec_7;
import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
        System.out.print("N1: ");
        int a=k.nextInt();
        System.out.print("N2: ");
        int b=k.nextInt();

        while (a%b!=0) {
            int rem=a%b;
            a=b;
            b=rem;
        }
        System.out.println("HCF: "+b);
    }
}
