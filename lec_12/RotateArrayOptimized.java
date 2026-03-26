import java.util.Scanner;
public class RotateArrayOptimized {
    public void rotate(int[] nums, int k){
        int n = nums.length;
        k = k %n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
    void reverse(int[] arr, int s, int e){
        while(s<e){
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
        }
    }
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
        RotateArrayOptimized r = new RotateArrayOptimized();
        r.rotate(arr, k);
        System.out.println("The rotated array is: ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

