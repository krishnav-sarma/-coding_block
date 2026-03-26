package lec_2;
public class even1to10000 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
    }
}