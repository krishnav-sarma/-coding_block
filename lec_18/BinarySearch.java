import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch{
    public static void binarySearch(int[] arr, int target){
        Arrays.sort(arr);
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(arr[mid] == target){
                System.out.println("Element found at index: " + mid);
                return;
            }
            else if(arr[mid] < target){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        System.out.println("Element not found in the array.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        binarySearch(arr, target);
    }
}

