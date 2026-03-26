import java.util.Scanner;
public class LinearSearch{
    public static void linearSearch(int[] arr, int k){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == k){
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found in the array.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
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
        System.out.println("Enter the number to search: ");
        int k = sc.nextInt();
        linearSearch(arr, k);
    }
}
