package lec_11;
import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("enter size: ");
        int n=k.nextInt();

        int arr[]=new int[n];
        
        //input
        for (int i = 0; i <n; i++) {
            arr[i]=k.nextInt();
        }

        for (int i = 0; i <n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j]>arr[j+1]) {

                    // swap(arr, 0,4);

                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;

                }

            }
        }

        //output
        System.out.println("array elements:");
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+"\t");
        }
    }  
    
    // static void swap(int arr[], int a,int b){
    //     int t=arr[a];
    //     arr[a]=arr[b];
    //     arr[b]=t;
    // }
}
