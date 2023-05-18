import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrNum = scanner.nextInt();
        int target = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < arrNum; i++) {
            int a = scanner.nextInt();
            if (target > a) {
                System.out.print(a + " ");
                arr.add(a);
            }
        }
    }
}