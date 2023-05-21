import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = num - i - 1; j > 0; j--)
                System.out.print(' ');
            for (int k = 0; k < 2 * i + 1; k++)
                System.out.print('*');
            System.out.print('\n');
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print(' ');
            for (int k = 2 * (num - i - 1) - 1; k > 0; k--)
                System.out.print('*');
            System.out.print('\n');

        }
    }
}