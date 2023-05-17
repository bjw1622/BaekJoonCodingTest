import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader((new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        int n = Integer.parseInt(bf.readLine());

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j <= n - i; j++) {
                bw.write(" ");
            }
            for (int k = 1; k <= i; k++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
    }
}