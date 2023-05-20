import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            arr.add(-1);
        }
        String inputValue = scanner.next();
        for (int i = 0; i < inputValue.length(); i++) {
            char ch = inputValue.charAt(i);
            if (arr.get(ch - 'a') == -1) {
                arr.set(ch - 'a', i);
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}