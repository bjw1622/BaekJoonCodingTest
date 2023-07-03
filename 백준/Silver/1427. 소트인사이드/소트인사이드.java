import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        List<Integer> b = new ArrayList<>();
        for(int i =0; i < a.length(); i++) {
            b.add((a.charAt(i)) - '0');
        }
        Collections.sort(b,(d,e)->e-d);
        for(int c : b){
            System.out.print(c);
        }
    }
}

