import java.util.Scanner;
class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            int n = nums[i];

            if(n > max1){
                max3 = max2;
                max2 = max1;
                max1 = n;
            }
            else if(n > max2){
                max3 = max2;
                max2 = n;
            }
            else if(n > max3){
                max3 = n;
            }

            if(n < min1){
                min2 = min1;
                min1 = n;
            }
            else if(n < min2){
                min2 = n;
            }
        }

        int product1 = max1 * max2 * max3;
        int product2 = min1 * min2 * max1;

        if(product1 > product2)
            return product1;
        else
            return product2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        MaximumProductOfThreeNumbers solution = new MaximumProductOfThreeNumbers();
        int result = solution.maximumProduct(nums);
        System.out.println("The maximum product of three numbers is: " + result);
    }
}