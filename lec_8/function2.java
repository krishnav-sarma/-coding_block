package lec_8;
public class function2 {
    
     public static void even_odd(int num1) {
        if (num1%2==0) {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }

    //  public static int even_odd(int num1) {
    //     if (num1%2==0) {
    //         return ;
    //     }else{
    //         System.out.println("odd");
    //     }
    // }


    public static void main(String[] args) {
         int a=7;

         even_odd(a);
    }
}
