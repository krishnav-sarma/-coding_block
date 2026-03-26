import java.util.Scanner;
public class Pattern9Func{
    public static void pattern9(int x){
        for(int row=1; row<=(2*x)-1; row++){
                System.out.print("* ");
            }
            System.out.println();
        int space = 1;
            for(int i = x-1; i>=1; i--)
            {
                for(int j = 1 ; j<=i; j++){
                    
                System.out.print("* ");
                }
                for(int k = 1; k<=space; k++){
                    System.out.print("  ");
                }
            
            for(int l=1; l<=i; l++){
                System.out.print("* ");
            }
            System.out.println();
            space+=2;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        pattern9(n);
    }
}