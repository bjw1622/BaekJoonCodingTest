import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumber = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < totalNumber; i++) {
            int a = scanner.nextInt();
            arr.add(a);
        }
        int answer = 0;
        int target = scanner.nextInt();
        for (int i = 0; i < arr.size(); i++) {
            if (target == arr.get(i)) {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}