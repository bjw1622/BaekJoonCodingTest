import java.util.*;
import java.io.*;

public class Main {
    static int A = 1, B = 1;
    static int max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 9; j++) {
                int num = Integer.parseInt(st.nextToken());
                if(num > max){ 
                    max = num; 
                    A = i;
                    B = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(A + " " + B);
    }
}