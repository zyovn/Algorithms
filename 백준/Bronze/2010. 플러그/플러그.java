import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N, cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        cnt = 1; // 컴퓨터 연결
        for (int i = 0; i < N; i++) {
            cnt += Integer.parseInt(br.readLine());
        }
        cnt -= N; // 멀티탭 꽂은 개수
        System.out.println(cnt);
    }
}