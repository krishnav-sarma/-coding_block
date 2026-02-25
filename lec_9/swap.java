import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);

        int a=k.nextInt();
        int b=k.nextInt();

        withtemp(a, b);
        witharithmatic(a, b);
        withxor(a, b);
    }

    static void withtemp(int a, int b){
        int temp=b;
        b=a;
        a=temp;

        System.out.println("Swapped");
        System.out.println(a);
        System.out.println(b);
    }

    static void witharithmatic(int a, int b){
        a= a+b;
        b=a-b;
        a=a-b;

        System.out.println("Swapped");
        System.out.println(a);
        System.out.println(b);

    }

    static void withxor(int a, int b){
        a= a^b;
        b=a^b;
        a=a^b;

        System.out.println("Swapped");
        System.out.println(a);
        System.out.println(b);

    }
}
