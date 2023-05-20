import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberConunt = scanner.nextInt();
        int answer = 0;
        String number = scanner.next();
        for (int i = 0; i < numberConunt; i++) {
            answer += Character.getNumericValue(number.charAt(i));
        }
        System.out.println(answer);

    }
}