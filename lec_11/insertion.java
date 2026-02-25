package lec_11;
import java.util.Scanner;

public class insertion {
     public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("enter size: ");
        int n=k.nextInt();

        int arr[]=new int[n];
        
        //input
        for (int i = 0; i <n; i++) {
            arr[i]=k.nextInt();
        }

        for (int i = 1; i <n; i++) {
            int j=i;

            while (j>=1 && arr[j]<arr[j-1]) {
                int t= arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=t;
                j--;
            }
        }
        //output
        System.out.println("array elements:");
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+"\t");
        }
    }  
}
