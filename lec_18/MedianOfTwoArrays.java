import java.util.Scanner;
public class MedianOfTwoArrays{
    public static double median(int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr3 = new int[arr1.length + arr2.length];
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i < arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        double mid = 0;
        int n = arr3.length;
        if(n%2 == 0){
            mid = (double)(arr3[n/2] + arr3[n/2-1])/2;
        }
        else{
            mid = arr3[n/2];
        }
        return mid;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array: ");
        int n = sc.nextInt();
        System.out.println("Enter the size of second array: ");
        int m = sc.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[m];
        System.out.println("Enter the elements of first array: ");
        for(int i = 0; i<n; i++){
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of second array: ");
        for(int j = 0; j<m; j++){
            nums2[j] = sc.nextInt();
        }
        double result = median(nums1, nums2);
        System.out.println("The median of the two arrays is: " + result);
    }
}