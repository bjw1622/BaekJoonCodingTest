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
import java.util.*;
public class Main {
    static int n, m;
    static int[][] graph;
    static boolean[][] visited;
    static int count = 0;
    static int[][] pos = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};


    static void bfs(int x, int y) {
        visited[x][y] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int nowX = arr[0];
            int nowY = arr[1];

            for (int i = 0; i < pos.length; i++) {
                int nx = nowX + pos[i][0];
                int ny = nowY + pos[i][1];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && graph[nx][ny] == 1 && !visited[nx][ny]) {
                    count++;
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        boolean zero = true;
        List<Integer> answer = new ArrayList<>();

        graph = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                graph[i][j] = sc.nextInt();
                if (graph[i][j] == 1) {
                    zero = false;
                }
            }
        }

        if (zero == true) {
            System.out.println("0");
            System.out.println("0");
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                count = 0;
                if (graph[i][j] == 1 && !visited[i][j]) {
                    count++;
                    bfs(i, j);
                    answer.add(count);
                }
            }
        }
        Collections.sort(answer);
        System.out.println(answer.size());
        System.out.println(answer.get(answer.size() - 1));
    }
}

