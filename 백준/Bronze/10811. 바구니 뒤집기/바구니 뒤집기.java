import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 바구니 생성
        int basket = scanner.nextInt();
        // 바꿀 횟수 생성
        int changeNumber = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < basket + 1; i++) {
            arr.add(i);
        }
        // 역순 알고리즘 추가
        for (int i = 0; i < changeNumber; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            while (a < b) {
                int temp = arr.get(a);
                arr.set(a, arr.get(b));
                arr.set(b, temp);
                a++;
                b--;
            }
        }
        for (int i = 1; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        scanner.close();
    }
}