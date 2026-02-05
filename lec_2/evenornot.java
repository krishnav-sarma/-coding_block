package lec_2;
import java.util.*;

public class evenornot {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in); 
        System.out.print("Enter number:");
        int a=k.nextInt();
        if (a%2==0) {
            System.out.println(a+ " is even");
        }else{
            System.out.println(a+ " is not even");
        }
    }
}
