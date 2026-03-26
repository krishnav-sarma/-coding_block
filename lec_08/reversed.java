package lec_8;
public class reversed {

    // public static void reversed(int num1) {
    // int output = 0;
    // while (num1 != 0) {
    // int result = num1 % 10;
    // output = output * 10 + result;
    // num1 = num1 / 10;
    // }
    // System.out.println(output);
    // }

    public static int reversed(int num1) {
        int output = 0;
        while (num1 != 0) {
            int result = num1 % 10;
            output = output * 10 + result;
            num1 = num1 / 10;
        }
        return output;
    }

    public static void main(String[] args) {
        int n = 1234;

        // reversed(n);

        int resersed_num = reversed(n);

        System.out.println(resersed_num);
    }
}
