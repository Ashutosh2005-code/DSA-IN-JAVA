import java.util.Scanner;

public class bridge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {

            // Left side
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }

            // Middle space
            for (int col1 = 1; col1 <= 2 * row - 3; col1++) {
                System.out.print("  ");
            }

            // Right side
            if (row == 1) {

                for (int col2 = 1; col2 <= n - row; col2++) {
                    System.out.print("* ");
                }
            } else {
                for (int col2 = 1; col2 <= n - row + 1; col2++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}