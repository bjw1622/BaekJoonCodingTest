import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (B - 45 >= 0) {
            System.out.printf("%d %d", A, B - 45);
        } else if (B - 45 <= 0 && A >= 1) {
            System.out.printf("%d %d", A - 1, 60 + (B - 45));
        } else if (B - 45 <= 0 && A == 0) {
            System.out.printf("%d %d", 23, 60 + (B - 45));

        }
    }
}