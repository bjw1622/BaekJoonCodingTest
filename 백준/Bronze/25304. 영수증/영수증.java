import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int count = scanner.nextInt();
        int sumTotal = 0;
        for (int i = 0; i < count; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            sumTotal += a * b;
        }
        if (sumTotal == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}