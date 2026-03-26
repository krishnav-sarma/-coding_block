import java.util.Scanner;
class TrappingRainwater {
    public static int trap(int[] height) {

        int n = height.length;
        if(n==0)
            return 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            if(height[i] > leftMax[i-1])
                leftMax[i] = height[i];
            else
                leftMax[i] = leftMax[i-1];
        }

        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            if(height[i] > rightMax[i+1])
                rightMax[i] = height[i];
            else
                rightMax[i] = rightMax[i+1];
        }

        int totalWater = 0;

        for(int i = 0; i < n; i++){
            int maxWaterLevel;

            if(leftMax[i] < rightMax[i])
                maxWaterLevel = leftMax[i];
            else
                maxWaterLevel = rightMax[i];

            int waterLevel = maxWaterLevel - height[i];

            if(waterLevel > 0)
                totalWater += waterLevel;
        }

        return totalWater;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of bars:");
        int n = sc.nextInt();
        int[] height = new int[n];
        System.out.println("Enter the heights of the bars:");
        for(int i = 0; i < n; i++){
            height[i] = sc.nextInt();
        }
        int result = trap(height);
        System.out.println("Total trapped rainwater: " + result);
    }
}