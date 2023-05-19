import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int a = scanner.nextInt();
            if (!arr.contains(a % 42)) {
                arr.add(a % 42);
            }
        }
        System.out.println(arr.size());
    }
}