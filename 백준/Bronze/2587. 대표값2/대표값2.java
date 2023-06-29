import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. 정렬 후 평균 구하기
        // 2. 전체 갯수 /2 값 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> arr = new ArrayList<>();
        for(int i=0;i<5;i++){
            String a = br.readLine();
            arr.add(a);
        }
        int total = 0;
        for(String a : arr){
            total += Integer.parseInt(a);
        }
        Collections.sort(arr);
        System.out.println(total/5);
        System.out.println(arr.get(2));

    }
}

