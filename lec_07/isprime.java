package lec_7;
import java.util.Scanner;

public class isprime {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=k.nextInt();

        int isprime=1;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isprime=0;
                break;
            }
        }
        if(isprime==1){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }

    }
}
