import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.next();
        System.out.println((int) temp.charAt(0));
        scanner.close();
    }
}