package lec_4;

import java.util.*;

public class pattern_1 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.print("enter value n: ");
        int n =k.nextInt();

        //for loop

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print("* ");
            }System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        //while loop

        
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}





// package lec_4;

// import java.util.*;

// public class pattern_1 {
//     public static void main(String[] args) {
//         Scanner k = new Scanner(System.in);
//         System.out.print("enter value n: ");
//         int n = k.nextInt();

//         int i = 0;
//         while (i < n) {
//             int j = 0;
//             while (j < n) {
//                 System.out.print("* ");
//                 j++;
//             }
//             System.out.println();
//             i++;
//         }

//     }
// }
