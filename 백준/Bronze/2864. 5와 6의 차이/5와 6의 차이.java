import java.util.Scanner;
public class Main {
    public static void main(String[] args)   {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] input = a.split(" ");
        int[] answer = {0,0};
        answer[0] += Integer.parseInt(input[0].replace('6','5'));
        answer[0] += Integer.parseInt(input[1].replace('6','5'));
        answer[1] += Integer.parseInt(input[0].replace('5','6'));
        answer[1] += Integer.parseInt(input[1].replace('5','6'));
        for(int s : answer){
            System.out.print(s+" ");
        }
    }
}