import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            arr.add(b);
        }
        //Max
        int max = Collections.max(arr);
        int min = Collections.min(arr);
        System.out.print(min + " ");
        System.out.print(max);
    }
}