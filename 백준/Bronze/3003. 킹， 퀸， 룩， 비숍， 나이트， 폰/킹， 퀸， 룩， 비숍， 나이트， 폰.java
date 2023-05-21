import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 2, 2, 8));
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int number = scanner.nextInt();
            System.out.print(arr.get(i) - number + " ");
        }
    }
}