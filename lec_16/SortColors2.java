import java.util.Scanner;
public class SortColors2{
    public static void sortColors(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            int min = i;
            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(arr[i] > arr[min]){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
    }
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sortColors(arr);
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}