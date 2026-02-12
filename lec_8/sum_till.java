package lec_8;
public class sum_till {
    // public static void sum_even_till() {
    //     int sum =0;
    //     for (int i = 0; i <=10000; i++) {
    //         if (i%2==0) {
    //             sum=sum+i;
    //         }
    //     } 
    //     System.out.println(sum);
    // }

    public static int sum_even_till() {
        int sum =0;
        for (int i = 0; i <=10000; i++) {
            if (i%2==0) {
                sum=sum+i;
            }
        } 
        return sum;
    }


    public static void main(String[] args) {
        // sum_even_till();

        int h= sum_even_till();
        System.out.println(h);
    }
}
