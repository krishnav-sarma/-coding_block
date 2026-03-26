package lec_8;
public class even_till {

    // public static int even_till() {
    // for (int i = 0; i <=10000; i++) {
    // if (i%2==0) {
    // return i;
    // }
    // }
    // return -1;
    // }

    public static void even_till() {
        for (int i = 0; i <= 10000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        even_till();
        // int s=even_till();
        // System.out.println(s);
    }
}
