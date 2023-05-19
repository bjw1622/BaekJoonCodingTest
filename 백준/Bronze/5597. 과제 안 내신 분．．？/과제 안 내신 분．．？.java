import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 28; i++) {
            int a = scanner.nextInt();
            arr.add(a);
        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.contains(i + 1) != true) {
                arr2.add(i + 1);
            }
        }
        if (arr2.size() == 0) {
            arr2.add(29);
            arr2.add(30);
        } else if (arr2.size() == 1 && arr.contains(29)) {
            arr2.add(30);
        } else if (arr2.size() == 1 && arr.contains(30)) {
            arr2.add(29);
        }
        for (int i = 0; i < arr2.size(); i++) {
            System.out.println(arr2.get(i));
        }
    }
}