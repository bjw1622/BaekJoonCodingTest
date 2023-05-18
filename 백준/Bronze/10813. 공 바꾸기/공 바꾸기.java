import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basket = scanner.nextInt();
        int count = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i < basket + 1; i++) {
            arr.add(i);
        }
        for (int i = 0; i < count; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int aValue = arr.get(a - 1);
            int bValue = arr.get(b - 1);
            arr.set(a - 1, bValue);
            arr.set(b - 1, aValue);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}