import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int n = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < n; i++) {
//            String string = br.readLine();
//            int a = Integer.parseInt(string.split(" ")[0]);
//            int b = Integer.parseInt(string.split(" ")[1]);
//            bw.write("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b) + "\n");
//        }
//        bw.flush();
        BufferedReader bf = new BufferedReader((new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        int n = Integer.parseInt(bf.readLine());

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j <= i; j++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
    }
}