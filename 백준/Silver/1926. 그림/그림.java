//        1. 아이디어
//            2중 for => 값 1 and 방문 X => BFS
//            BFS 돌면서 그림 개수 +1, 최대값을 갱신
//        2. 시간복잡도
//              BFS : O(V+E) 5MN => M이 최대 500, N이 최대 500 이므로 1250000인데 2억보다 작으므로 OK
//              V : M * N
//              E : 4 * M * N
//        3. 자료구조
//        그래프 전체 지도 : int[][]
//        방문 여부 : boolean[][]
//        QUEUE : BFS
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    static int n,m;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int check =0;
    static int maxV = 0;
    public static void bfs(int x, int y){
        visited[x][y] =  true;
        for(int i =0; i<dx.length;i++){
            int nx = x+dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < n && ny>=0 && ny<m && graph[nx][ny] == 1 && visited[nx][ny] == false ){
                check += 1;
                bfs(nx,ny);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n][m];
        visited = new boolean[n][m];
        for(int i = 0; i < n; ++i) {
            String strr = br.readLine();
            st = new StringTokenizer(strr); // length 5
            for(int j = 0; j < m; ++j) {
                graph[i][j] = Integer.parseInt(st.nextToken()); // substring이랑 차이??
            }
        }
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                check = 1;
                if(graph[i][j] == 1 && visited[i][j] == false){
                    bfs(i,j);
                    answer.add(check);
                    if (check > maxV){
                        maxV = check;
                    }
                }
            }
        }
        System.out.println(answer.size());
        System.out.println(maxV);

    }

    public void printArr(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
}