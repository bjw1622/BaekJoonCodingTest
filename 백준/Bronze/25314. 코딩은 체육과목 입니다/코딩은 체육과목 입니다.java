import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt() / 4;
        String answer = "";
        for (int i = 1; i < a + 1; i++) {
            answer += "long ";
        }
        System.out.println(answer + "int");
        scanner.close();
    }
}