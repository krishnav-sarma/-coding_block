import java.util.Scanner;

public class tofind {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);

        System.out.println("enter size: ");
        int n=k.nextInt();

        int arr[]=new int[n];
        
        //input
        for (int i = 0; i <n; i++) {
            arr[i]=k.nextInt();
        }

        //output
        // System.out.println("array elements:");
        // for (int i = 0; i <n; i++) {
        //     System.out.print(arr[i]+" ");
        // }

        System.out.println("to find: ");
        int f=k.nextInt();

        boolean key =false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == f) {
                System.out.println("element founded");

                key= true;
                break;
            }
        }
        if (key==false) {
            System.out.println("element not found");
        }
    }
}