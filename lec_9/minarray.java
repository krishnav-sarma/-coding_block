import java.util.Scanner;

public class minarray {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("enter size: ");
        int n=k.nextInt();

        System.out.println("======================");

        int arr[]=new int[n];
        
        //input
        for (int i = 0; i <n; i++) {
            arr[i]=k.nextInt();
        }

        int min= arr[0];

        for (int i = 1; i <n; i++) {
            if (min>arr[i]) {
                min=arr[i];
            }
        }
        
        System.out.println("min element:");
        System.out.println(min);


    }
}

    
