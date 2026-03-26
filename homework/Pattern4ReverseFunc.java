import java.util.Scanner;
public class Pattern4ReverseFunc{
    public static void pattern4Reverse(int x){
        int space = 0;
        int star = x;
        int row = 1;
        while(row<=x){
            int i = 1;
            while(i<=2*space)
            {
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            space++;
            star--;
            row++;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        pattern4Reverse(n);
    }
}