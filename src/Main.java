import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the input.
        Scanner scanner = new Scanner(System.in);

        // Stores the entered number.
        int n = scanner.nextInt();

        // Stores the sum.
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}