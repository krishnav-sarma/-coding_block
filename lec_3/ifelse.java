package lec_3;

import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        
        System.out.print("enter value: ");
        int n= k.nextInt();

        if (n>=300 && n<=480) {
            System.out.println("price is macboook");
        }else if (n>=200 && n<=280) {
            System.out.println("price is kurkure");
        }else if (n>=50 && n<=1500) {
            System.out.println("price is cycle ");
        }else if (n>50 && n<=80) {
            System.out.println("price is bike");
        }else{
            System.out.println("Better luck next time...");
        }
    }
}
