import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no : ");
        int n = sc.nextInt();
        //Solid Squre
//        for(int row = 1; row <= n; row++){
//            for(int col = 1; col <= n; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


           //Solid Rectangle
//        for(int row = 1; row <= n; row++){
//            for(int col = 1; col <= n+2; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
              //Right angle triangle
//        for(int row = 1; row <= n; row++){
//            for(int col = 1; col <= row; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Solid Rhombus
        //spaces:
//        for(int row = 1; row <= n; row++){
//            for(int col = 1; col <= n-row; col++){
//                System.out.print("  ");
//            }
//
//            //Stars:
//            for(int col1 = 1; col1 <= n; col1++ ){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Inverted Triangle
//        for(int row = 1; row <= n; row++){
//            for(int col = 1 ; col <= (n-row+1);  col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Equilateral triangle:

//        for(int row = 1; row <= n; row++){
//            //space:
//            for(int col = 1 ; col <=n-row ; col++){
//                System.out.print("  ");
//            }
//
//            //star:
//
//            for(int col1 = 1 ; col1 <= 2*row-1 ; col1++ ){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }

        // Inverted Equilateral triangle::

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row-1; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2*(n-row)+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}