import java.util.Scanner;

public class maxarray {
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

        int max= arr[0];

        for (int i = 1; i <n; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("max element:");
        System.out.println(max);


    }
}

    
