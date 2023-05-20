import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = Integer.toString(scanner.nextInt());
        String b = Integer.toString(scanner.nextInt());

        StringBuffer sa = new StringBuffer(a);
        sa.reverse().toString();
        StringBuffer sb = new StringBuffer(b);
        sb.reverse().toString();

        int toIntSa = Integer.parseInt(sa.toString());
        int toIntSb = Integer.parseInt(sb.toString());
        System.out.println(toIntSa > toIntSb ? toIntSa : toIntSb);
    }
}
