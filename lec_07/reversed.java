package lec_7;
import java.util.Scanner;

public class reversed {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.print("Enter num: ");
        int n=k.nextInt();

        int output=0;
        while(n>0){
            int rem=n%10;
            output=output*10+rem;
            n=n/10;
        }
        
        System.out.println("Reversed number: "+output);
    }
}
