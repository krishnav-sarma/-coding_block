import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is: ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nEnter the number of times to rotate: ");
        int k = sc.nextInt();
        for(int i = 1; i<=k; i++){
            int last = arr[arr.length-1];
        for(int j = arr.length-1; j>0; j--){
            arr[j] = arr[j-1];
        }
        arr[0] = last;
    }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

