public class Loops {
    public static void main(String[] args) {
//        for(int a = 1; a <= 5; a++) {
//            for(int b = 1; b <= 5; b++) {
//                System.out.print("* ");
//            }
//            System.out.println( );
//        }

//        for(int i = 1 ; i<=5 ; i++){  // number of rows
//            for(int j = 1 ; j<=7 ; j++){ //number of columns
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //right angle triangle:
//        for (int row = 1; row<=5 ; row++){ // rows
//            for (int col = 1; col <=i; col++){ // columns
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //rhombus pattern
//        for (int row = 1; row <= 5; row++) {
//
//            //space
//            for (int col1 = 1; col1 <= 5 - row; col1++) {
//                System.out.print(" ");
//            }
//
//            //number of stars
//            for (int col2 = 1; col2 <= 5; col2++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        // inverted right angle triangle
//        int n = 5;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n-row+1; col++){
//            System.out.print("* ");
//        }
//
//        System.out.println();
//    }




//        //solid pyramid
//        int n =5;
//        for(int row = 1; row <= n; row++){
//            //spaces
//            for(int col = 1; col <= n-row; col++){
//                System.out.print("  ");
//            }
//
//            //stars
//            for(int col1 = 1; col1 <= 2*row-1; col1++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //inverted solid pyramid:
//        int n = 4;
//        for (int row = 1; row <= n; row++) {
//            //space
//            for (int col1 = 1; col1 <= row-1; col1++) {
//                System.out.print("  ");
//            }
//            //stars
//            for (int col = 1; col <= 2*(n-row)+1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //hollow squre

//        int n = 10;
//
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= 6; col++) {
//
//                if (row == 1 || row == n || col == 1 || col == 6) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //Hollow right angle triangle:
//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//
//            if (row == 1 || row == 2 || row == n) {
//
//                for (int col = 1; col <= row; col++) {
//                    System.out.print("* ");
//                }
//
//            } else {
//
//                System.out.print("* ");
//
//                for (int col = 1; col <= row - 2; col++) {
//                    System.out.print("  ");
//                }
//
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }

        //Hollow pyramid:
//        int n = 5;
//        for(int row = 1; row <= n; row++){
//            for(int col = 1; col <= n - row; col++){
//                System.out.print("  ");
//            }
//            if(row == 1 || row == n){
//                for(int col = 1; col <= 2*row-1; col++){
//                    System.out.print("* ");
//                }
//            }
//            else{
//                System.out.print("* ");
//
//                for(int col = 1; col <= (2*row-1)-2; col++){
//                    System.out.print("  ");
//                }
//
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

          //Daimond ;
//        int n = 5;
//
//        //part =1
//        for(int row = 1; row <= n; row++){
//            //spaces
//            for(int col = 1; col <= n-row; col++){
//                System.out.print("  ");
//            }
//
//            //stars
//            for(int col1 = 1; col1 <= 2*row-1; col1++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        //part = 2
//        for (int row = 2; row <= n; row++) {
//            //space
//            for (int col1 = 1; col1 <= row-1; col1++) {
//                System.out.print("  ");
//            }
//            //stars
////            if (row == 1){
////                continue;
////            }
//            for (int col = 1; col <= 2*(n-row)+1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //hollow Daimond;


          //PART - 1
//        int n = 4;
//        for(int row = 1; row <= n; row++){
//            for(int col = 1; col <= n - row; col++){
//                System.out.print("  ");
//            }
//            if(row == 1 ){
//                for(int col = 1; col <= 2*row-1; col++){
//                    System.out.print("* ");
//                }
//            }
//            else{
//                System.out.print("* ");
//
//                for(int col = 1; col <= 2*row-3; col++){
//                    System.out.print("  ");
//                }
//
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//
//          //PART -2
//        for(int row = 1 ; row <= n-1; row++){
//
//            //SPACES
//            for(int col = 1; col <=  row; col++){
//                System.out.print("  ");
//            }
//
//            //STAR AND SPACES
//            if(row == n-1){
//                System.out.print("* ");
//            }
//            else{
//                System.out.print("* ");
//
//                for(int col = 1; col <=2*(n-row)-3; col++){
//                    System.out.print("  ");
//                }
//
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        // Butterfly triangle pattern;
             int n= 5;
              // UPPER HALF
                for (int row = 1; row <=n ; row++){
            for (int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            for(int col = 1; col <= 2*(n-row); col++){
                System.out.print("  ");
            }
            for(int col = 1; col <=row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

            //LOWER HALF
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++){
                System.out.print("* ");
            }
            for(int col = 1; col <= 2*(row-1); col++){
                System.out.print("  ");
            }
            for(int col = 1; col <= n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
