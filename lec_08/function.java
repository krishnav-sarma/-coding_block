package lec_8;
public class function {

    // public static void add(int num1,int num2) {
    //     int c= num1+num2;

    //     System.out.println(c);
    // }

    public static int add(int num1,int num2) {
        int c= num1+num2;
        return c;
    }
    public static void main(String[] args) {

        int a=6;
        int b=4;

        // add(a,b);
        int m= add(a,b);

        System.out.println(m);
    }
    
    
}