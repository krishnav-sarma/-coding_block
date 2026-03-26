import java.util.Scanner;

public class array {
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
        System.out.println("array elements:");
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+"\t");
        }


        // display(n);
    }
}

    
