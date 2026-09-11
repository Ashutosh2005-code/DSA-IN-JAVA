import java.util.Scanner;

public class TakingInput {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1: ");
        int x = sc.nextInt();
        System.out.println("Enter a number 2: ");
        int y = sc.nextInt();

        long result = x+y;
        System.out.println("The result is " + result);

        sc.close();

    }

}
