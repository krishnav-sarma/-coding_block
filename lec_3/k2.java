package lec_3;

import java.util.*;

public class k2 {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);

        System.out.println("enter value a: ");
        int a =k.nextInt();

        System.out.println("enter value d: ");
        int d =k.nextInt();

        System.out.println("variation");

        for (int i = 1; i <=50 ; i++) {
            a=a+d;
            System.out.println(a);
        }


    }
}
