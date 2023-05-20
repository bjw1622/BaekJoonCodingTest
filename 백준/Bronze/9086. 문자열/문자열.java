import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            String stringInput = scanner.next();
            if (stringInput.length() == 0) {
                System.out.printf("%s%s", stringInput, stringInput);
                System.out.println();
            } else {
                System.out.printf("%s%s", stringInput.charAt(0), stringInput.charAt(stringInput.length() - 1));
                System.out.println();
            }
        }
        scanner.close();
    }
}