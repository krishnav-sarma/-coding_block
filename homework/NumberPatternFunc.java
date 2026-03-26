import java.util.Scanner;
public class NumberPatternFunc{
    public static void numberPattern(int n){
        int star = 1;
        int space = n-1;
        for(int row=1; row<=n; row++){
            for(int i = 1; i<=space; i++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                System.out.print(row+ " ");
            }
            System.out.println();
            space--;
            star = star+2;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        numberPattern(n);
    }
}