public class Array
{
    static void main(String[] args)
    {
        //input in an  array;
//        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//
//        for(int i =0 ; i <= n-1 ; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        for(int val : arr){
//            System.out.print(val+" ");
//        }





//        //declaration
//        int arr[];
//        //declaration
//        arr = new int[5];
//        //initialization
//        int brr[] = {1,2,3,4,5};
//        //accessing element of array;
//        System.out.println(brr[2]);
//
//        //for each loop;
//        for(int val:brr)
//        {
//            System.out.println(val);
//        }


//        int brr[] = {12,14 , 1245};
//         int n = brr.length;
//         for(int i=0;i<=n-1;i++)
//         {
//             System.out.println(brr[i]+" ");
//         }

        //Sum of elements of an array;
//        int arr[] = new int [5];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of elements in the array: ");
//        int n = arr.length;
//
//        int sum = 0;
//
//        for(int i =0; i<n; i++){
//            arr[i] = sc.nextInt();
//
//            sum += arr[i];
//        }
//
//        for(int val : arr){
//            System.out.println(val+" ");
//
//        }
//
//        System.out.println("the sum of the elements are: " + sum);



//        int arr[] = {1,2,3,4,5};
//        int ans = 1;
//        int n = arr.length;
//
//
//        for(int val : arr){
//            System.out.println(val);
//        }
//
//
//        for(int i=0;i<=n-1;i++){
//            int value = arr[i];
//            ans = ans * value;
//        }
//
//        System.out.println("the multi of the elements are: " + ans);


//        int arr[] = {4,2,-5,21,15};
//        int n = arr.length;
//        int max = arr[0];
//
//
//        for (int i = 0; i <=n-1; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//
//        }
//        System.out.println(max);


        int arr[] = {4,2,-5,21,10};
        int n = arr.length;
        int min = arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum number is "+min);



    }
}
