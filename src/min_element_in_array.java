import java.util.Scanner;

public class min_element_in_array {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {
                {1,2,3},
                {4,5,6}
        };
        int min = arr[0][0];
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            System.out.println(min);
        }


    }

}
