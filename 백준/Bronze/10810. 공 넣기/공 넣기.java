import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basket = scanner.nextInt();
        int count = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < basket; i++) {
            arr.add(0);
        }
        for (int i = 0; i < count; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int third = scanner.nextInt();
            for (int j = first - 1; j < second; j++) {
                arr.set(j, third);
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}