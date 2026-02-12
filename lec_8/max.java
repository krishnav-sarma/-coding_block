package lec_8;
public class max {

    // public static void max_no(int n1, int n2, int n3) {
    //     if (n1>n2 && n1>n3) {
    //         System.out.println(n1+" greater");
    //     }else if (n2>n1 && n2>n3) {
    //         System.out.println(n2+" greater");
    //     }else{
    //         System.out.println(n3+" greater");
    //     }
    // }

    public static int max_no(int n1, int n2, int n3) {
        if (n1>n2 && n1>n3) {
            return n1;
        }else if (n2>n1 && n2>n3) {
            return n2;
        }else{
            return n3;
        }
    }


    public static void main(String[] args) {
         int a=4;
         int b=6;
         int c=1;

        //  max_no(a,b,c);

        int k = max_no(a, b, c);

        System.out.println(k + "is greater");
    }
}
