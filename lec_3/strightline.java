package lec_3;
import java.util.*;
public class strightline {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);

        System.out.println("enter first coordinate:");
        int x1 = k.nextInt();
        int y1 = k.nextInt();
        
        System.out.println("enter second coordinate:");
        int x2 = k.nextInt();
        int y2 = k.nextInt();

        System.out.println("enter third coordinates:");
        int x3 = k.nextInt();
        int y3 = k.nextInt();


        int m1 = (y2-y1)/(x2-x1);
        int m2 = (y3-y2)/(x3-x2);

  
        if (m1==m2) {
            System.out.println("It is straight line...");
        }else{
            System.out.println("not straight...");
        }
    }
}
