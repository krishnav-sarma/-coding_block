import java.util.Scanner;
public class Pattern1Func{
    public static void pat(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        pat(n);
        }
    }