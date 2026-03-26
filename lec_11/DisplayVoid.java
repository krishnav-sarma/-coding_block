import java.util.Scanner;
public class DisplayVoid{
    public static void display(int[] arr){
        System.out.println("The array is: ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter the values: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        display(arr);
    }
}
