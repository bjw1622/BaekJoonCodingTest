import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static int[] dx = new int[]{1, -1, 0, 0};
    static int[] dy = new int[]{0, 0, 1, -1};
    static int target= 0;
    static ArrayList<Integer> answer = new ArrayList<>();
    static int count =0;

    public static void dfs(int x, int y, int[][] arr, boolean[][] visited) {
        visited[x][y] = true;
        arr[x][y] = target;
        count += 1;
        for(int k = 0; k < 4; ++k) {
            int nx = x + dx[k];
            int ny = y + dy[k];
            if (nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length && arr[nx][ny] == 1 && !visited[nx][ny]) {
                dfs(nx, ny, arr, visited);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        for(int i = 0; i < n; ++i) {
            String str = br.readLine();
            for(int j = 0; j < n; ++j) {
                arr[i][j] = Integer.parseInt(str.substring(j, j + 1));
            }
        }
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                count = 0;
                if (arr[i][j] == 1 && !visited[i][j]) {
                    target+=1;
                    dfs(i, j, arr, visited);
                    answer.add(count);
                }
            }
        }
        System.out.println(target);
        Collections.sort(answer);
        for(int i =0; i<answer.size();i++){
            System.out.printf("%d\n",answer.get(i));
        }
    }
}