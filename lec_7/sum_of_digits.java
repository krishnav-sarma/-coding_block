package lec_7;
import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.print("Enter num: ");
        int n=k.nextInt();

        int sum=0;

        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        
        System.out.println("Sum: "+sum);
    }
}
