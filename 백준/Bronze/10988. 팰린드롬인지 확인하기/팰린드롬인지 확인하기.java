import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pellindrom = scanner.next();
        ArrayList<Character> arr = new ArrayList<>();
        ArrayList<Character> arrReverse = new ArrayList<>();

        for (int i = 0; i < pellindrom.length(); i++) {
            arr.add(pellindrom.charAt(i));
            arrReverse.add(pellindrom.charAt(i));
        }
        Collections.reverse(arrReverse);
        int answer = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != arrReverse.get(i)) {
                answer = 0;
            }
        }
        System.out.println(answer);
    }
}