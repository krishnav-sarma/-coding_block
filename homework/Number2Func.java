import java.util.Scanner;
public class Number2Func{
    public static void number2(int n){
        int star = 1;
        int space = n-1;
        int cnt=1;
        for(int row=1; row<=n; row++){
            for(int i = 1; i<=space; i++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                System.out.print(cnt+ " ");
                cnt++;
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
        number2(n);
    }
}