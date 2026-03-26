import java.util.Scanner;
public class Pattern10Func{
    public static void pattern10(int x){
        int star = 1;
        for(int i = 1; i<=((2*x)-1); i++){
            for(int j = 1; j<=star; j++){
                System.out.print(" * ");
            }
            if(i<x){
                star ++;
            }
            else{
                star --;
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        pattern10(n);
    }
}