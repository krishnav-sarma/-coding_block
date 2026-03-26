import java.util.Scanner;
public class Pattern11Func {
    public static void pattern11(int x){
        int space = x-1;
        int star = 1;
        for(int row=1; row<=((2*x)-1); row++){
            for(int i=1; i<=space; i++){
                System.out.print("  ");
            }
            for(int j = 1; j<=star; j++){
                System.out.print("* ");
            }
            System.out.println("  ");
            if(row<x){
                    space --;
                    star ++;
                }
                else{
                    star --;
                    space ++;
                }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        pattern11(n);
    }
}
