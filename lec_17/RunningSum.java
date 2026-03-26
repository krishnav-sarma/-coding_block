import java.util.Scanner;
public class RunningSum{
    public static int[] runningSum(int[] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
            arr[i] = sum;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] result = runningSum(arr);
        for(int i = 0; i<result.length; i++){
            System.out.print(result[i]);
        }
    }
}