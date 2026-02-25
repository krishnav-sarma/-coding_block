package lec_11;
import java.util.Scanner;
public class selection {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("enter size: ");
        int n=k.nextInt();

        int arr[]=new int[n];
        //input
        for (int i = 0; i <n; i++) {
            arr[i]=k.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            int min=i;
            for (int j = i+1; j < n; j++) {
                if (arr[j]<arr[min]) {
                    min=j;
                }
            }
            int t=arr[i];
            arr[i]=arr[min];
            arr[min]=t;
        }

        //output
        System.out.println("array elements:");
        for (int x: arr) {
            System.out.print(x+"\t");
        }
    } 
}
