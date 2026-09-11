public class two_D_arrays {
    static void main(String[] args) {
//        //declaration;
//        int[][] arr;
//        //allocation;
//        arr = new int[3][4];
//        //init;
//        int[][] arr2 = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//
//        System.out.println(arr2[1][0]);


        //traversal in 2-D Array;
        //Input in 2-D Array;
//
//        int[][] arr3 = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//        //input;
//        for(int i = 0 ; i<=arr3.length -1; i++){
//            for(int j = 0 ; j<=arr3[i].length-1 ; j++){
//                System.out.println("value of row"+i+"column"+j);
//                arr3[i][j] = sc.nextInt();
//            }
//        }
//        //print;
//        for(int i = 0 ; i<=arr3.length -1; i++){
//            for(int j = 0 ; j<=arr3[i].length-1 ; j++){
//                System.out.print(arr3[i][j]+" ");
//            }
//            System.out.println();
//
//        }



        //Sum Of All The Elements;
//        int brr[][] = {
//                {1,3,4},
//                {1,5,6}
//        };
//        int sum = 0;
//
//        for(int i=0;i<brr.length;i++){
//            for(int j=0;j<brr[i].length;j++){
//                int value = brr[i][j];
//                sum+= value;
//            }
//        }
//        System.out.println(sum);


        //Multiply All The Elements;
//        int brr[][] = {
//                {1,1,1},
//                {1,1,1}
//        };
//        int ans = 1;
//
//        for(int i=0;i<brr.length;i++){
//            for(int j=0;j<brr[i].length;j++){
//                int value = brr[i][j];
//                ans*= value;
//            }
//        }
//        System.out.println(ans);

        //maximum element of an array;
        int brr1[][] = {
                {1,2,3},
                {14,13,5}
        };
        int max = brr1[0][0];

        for(int i=0;i<brr1.length;i++){
            for(int j=0;j<brr1[i].length;j++){
                if(brr1[i][j]>max){
                    max = brr1[i][j];
                }

            }

        }
        System.out.print(max + " ");

    }
}
