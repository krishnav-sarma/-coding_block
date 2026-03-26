import java.util.Scanner;
public class Pattern12Func{
    public static void pattern12(int x){
        int star = x-1;
        int space = 1;
        for(int row=1; row<=((2*x)-1); row++){
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }
            for(int i = 1; i<=space; i++){
                System.out.print("  ");
            }
            
            for(int k=1; k<=star; k++){
                System.out.print("* ");
            }
            System.out.println();
            if(row<x){
                star --;
                space +=2;
            }
            else{
                star ++;
                space-=2;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        pattern12(n);
    }
}