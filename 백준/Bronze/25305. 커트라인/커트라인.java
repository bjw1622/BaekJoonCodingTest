import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception  {
        // 입력
        // 응시자 수 n
        // 상 받는 사람 수 k
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        StringTokenizer st = new StringTokenizer(a);
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        String b = br.readLine();
        String[] stringArr = b.split(" ");
        List<Integer> arr = new ArrayList<>();
        for(String s : stringArr){
            arr.add(Integer.parseInt(s));
        }
        Collections.sort(arr,(q,w) -> w-q);
        System.out.println(arr.get(k-1));
    }
}

