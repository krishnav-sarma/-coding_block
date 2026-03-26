package lec_8;
public class simple_in {


    public static int interest(int t,int p,int r) {
        int in= (p*t*r)/100;

        return in;
    }



    // public static void interest(int t,int p,int r) {
    //     int in= (p*t*r)/100;

    //     System.out.println(in+ " is interest");
    // }


    public static void main(String[] args) {
        int t= 5;
        int p=12000;
        int r= 3;

        // interest(t,p,r);

        int in= interest(t, p, r);
        System.out.println(in+ " is interest");
    }
}
