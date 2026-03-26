package lec_3;

import java.util.*;

public class nestedif {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("enter value: ");
        int n = k.nextInt();

        if (n >= 300 && n <= 460) {
            System.out.println("you won macbook");
            if (n >= 300 && n <= 380) {
                System.out.println("won model m1");
            } else {
                System.out.println("won model m2");
            }

        } else if (n >= 200 && n <= 280) {
            System.out.println("won kurkure!!");
            if (n >= 200 && n <= 240) {
                System.out.println("chilli");
            } else {
                System.out.println("onion");
            }

        } else if (n >= 1100 && n <= 1500) {
            System.out.println("won cycle");
            if (n >= 1100 && n <= 1300) {
                System.out.println("avon cycle");
            } else {
                System.out.println("hero cycle");
            }

        } else if (n >= 50 && n <= 80) {
            System.out.println("won bike");
            if (n >= 50 && n <= 65) {
                System.out.println("bullet");
            } else {
                System.out.println("rajdoot");
            }
        } else {
            System.out.println("Better luck next time...");
        }
    }
}
