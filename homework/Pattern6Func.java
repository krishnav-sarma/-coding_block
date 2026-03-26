import java.util.Scanner;
public class Pattern6Func{
    public static void pattern6(int x){
        int star = 1;
        int space = x-1;
        for(int row=1; row<=x; row++){
            for(int i = 1; i<=space; i++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                if(j%2==1){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            space--;
            star = star+2;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        pattern6(n);
    }
}