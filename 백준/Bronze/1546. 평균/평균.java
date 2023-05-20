import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = 0;
        int num = scanner.nextInt();
        ArrayList<Double> arr = new ArrayList<Double>();
        while (j < num) {
            double temp = scanner.nextDouble();
            arr.add(temp);
            j++;
        }
        double max = Collections.max(arr);
        double total = 0;
        for (int i = 0; i < arr.size(); i++) {
            total += (arr.get(i) / max) * 100;
        }
        System.out.println(total / arr.size());
    }
}