import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        for (int i = 0; i < total; i++) {
            int repeat = scanner.nextInt();
            String word = scanner.next();
            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < repeat; k++) {
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println("");
        }
        scanner.close();
    }
}