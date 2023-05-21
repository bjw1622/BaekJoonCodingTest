import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[26];

        String sentence = scanner.next().toUpperCase();

        int max = -1;
        char st = '?';

        for (int i = 0; i < sentence.length(); i++) {
            arr[sentence.charAt(i) - 65] += 1;
            if (max < arr[sentence.charAt(i) - 65]) {
                max = arr[sentence.charAt(i) - 65];
                st = sentence.charAt(i);
            } else if (max == arr[sentence.charAt(i) - 65]) st = '?';
        }
        System.out.println(st);
    }
}