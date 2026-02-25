package lec_8.HW;
public class test {

    public static void main(String[] args) {
        int n = 6;

        System.out.println("-----------------pattern1-----------------");
        square(n);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-----------------pattern2-----------------");
        right_triangle(n);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-----------------pattern3-----------------");
        reversed_right_triangle(n);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-----------------pattern4-----------------");
        opposite_right_triangle(n);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-----------------pattern5-----------------");
        reversed_opposite_right_triangle(n);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-----------------pattern6-----------------");
        square_with_space_in_between(n);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-----------------pattern7-----------------");
        pyramid(n);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-----------------pattern8-----------------");
        spaced_pyramid(n);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-----------------pattern9-----------------");
        pyramid_with_execlematory(n);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-----------------pattern10-----------------");
        unknown1(n);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-----------------pattern11-----------------");
        unknown2(n);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-----------------pattern12-----------------");
        unknown3(n);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-----------------pattern13-----------------");
        unknown4(n);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-----------------pattern14-----------------");
        pyramid_with_num(n);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-----------------swastic-----------------");
        swastic(n);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-----------------pattern15-----------------");
        unknown5(n);

    }
// -----------------------------------------------
    static void square(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
// -----------------------------------------------
    static void right_triangle(int n){

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
// -----------------------------------------------
    static void reversed_right_triangle(int n){

        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void opposite_right_triangle(int n){

        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void reversed_opposite_right_triangle(int n){

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


     static void square_with_space_in_between(int n){

        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=n; j++) {
                if (i==0 || i==n || j==0 || j==n) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    static void pyramid(int n){

        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void spaced_pyramid(int n){

        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <i; j++) {
                System.out.print(" * ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void pyramid_with_execlematory(int n){

        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <=(2 * i - 1); j++) {              //---------------------------------pattern10-----------------------------------------
                if (j%2==1) {
                    System.out.print(" * ");
                }else{
                    System.out.print(" ! ");
                }
            }
            System.out.println();
        }
    }

    static void unknown1(int n){

        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <n; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void unknown2(int n){

        for (int i = 1; i <=n; i++) {

            for (int j = i; j <n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
           
    }

    static void unknown3(int n){

        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <i; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <=n; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }

        for (int i = 1; i <=n; i++) {

            for (int j = i; j <=n; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }   
    }


    static void unknown4(int n){

        for (int i = 1; i <=n; i++) {

            for (int j = i; j <=n; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <n; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pyramid_with_num(int n){

        for (int i = 0; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <i; j++) {
                System.out.print(i+" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }


    static void swastic(int n){

        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=n; j++) {
                if (i==n || j==0 || j==n) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            for (int j = 0; j <=n; j++) {
                if (i==n || i==0) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=n; j++) {
                if (i==n || j==n) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            for (int j = 0; j <=n; j++) {
                if (j==n) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    static void unknown5(int n) {

        for (int i = 1; i <n; i++) {
            int k=5;
            for (int j = 1; j < n; j++) {
                
                System.out.print(k+" ");
                k--;
            }
            System.out.println();
        }
    }

}
