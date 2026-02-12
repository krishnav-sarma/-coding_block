package lec_8;
public class sum_naturat {

    public static int sum(int n1) {
        int sum=0;
        for (int i = 0; i <=n1; i++) {
            sum=sum+i;   
        }
        return sum;
    }

    

    // public static void sum(int n1) {
    //     int sum=0;
    //     for (int i = 0; i <=n1; i++) {
    //         sum=sum+i;   
    //     }
    //     System.out.println(sum);
    // }


    public static void main(String[] args) {
        int n= 50;

        // sum(n);

        int s=sum(n);
        System.out.println(s);
    }
}
