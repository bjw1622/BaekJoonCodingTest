import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        List<Integer> arr = new ArrayList<>();
        for(int i =0; i<Integer.parseInt(str);i++){
            String a = br.readLine();
            arr.add(i,Integer.parseInt(a));
        }
        Collections.sort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
