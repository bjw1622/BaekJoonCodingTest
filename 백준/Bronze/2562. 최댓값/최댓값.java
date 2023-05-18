import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            int a = scanner.nextInt();
            arr.add(a);
        }
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
                maxIndex = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);
    }
}