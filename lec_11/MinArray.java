import java.util.Scanner;
public class MinArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is: ");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        int min = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The minimum value in the array is: " + min);
    }
}
