import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        StringTokenizer st = new StringTokenizer(num);
        int a = Integer.parseInt(st.nextToken());
        int[][] x = new int[a][2];

        for(int i=0; i<a; i++){
            String xy = br.readLine();
            StringTokenizer str = new StringTokenizer(xy);
            int xPoint = Integer.parseInt(str.nextToken());
            int yPoint = Integer.parseInt(str.nextToken());
            x[i][0] = xPoint;
            x[i][1] = yPoint;
        }

        Arrays.sort(x,(int[]x1, int[]x2)-> {
            // y좌표가 같을때는 x좌표 오름차순으로 정렬
            if(x1[1] == x2[1]){
                return x1[0] - x2[0];
            }
            // 같지 않을 때는 y좌 오름차순으로 정렬
            return  x1[1] - x2[1];
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<x.length; i++){
            sb.append(x[i][0]).append(" ").append(x[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}