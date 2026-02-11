package lec_7;
import java.util.Scanner;

public class prime_till_n {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=k.nextInt();


        for(int i=2;i<=n;i++){

            int isprime=1;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isprime=0;
                    break;
                }
            }

            if(isprime==1){
                System.out.print(i+" ");
            }
        }
    }
}
