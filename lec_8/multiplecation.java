package lec_8;
public class multiplecation {

    public static void mul(int n1) {
        for (int i = 1; i <= 10; i++) {
            int mul = n1 * i;
            System.out.println(n1 + " * " + i + "=" + mul);
        }
    }

    public static void main(String[] args) {
        int n = 7;

        mul(n);

    }
}
