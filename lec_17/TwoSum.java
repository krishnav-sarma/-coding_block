import java.util.Scanner;
public class TwoSum{
    public static int[] twoSum(int[] arr, int target){
        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            int sum = arr[i] + arr[j];

            if(sum == target){
                return new int[]{i, j};
            }
            else if(sum < target){
                i++;
            }
            else{
            j--;
        }
    }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] result = twoSum(arr, target);
        if(result[0] != -1){
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers found that add up to the target.");
        }
    }
}