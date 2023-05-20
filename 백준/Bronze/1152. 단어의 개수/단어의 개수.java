import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(word, " ");
        System.out.println(st.countTokens());
    }
}
