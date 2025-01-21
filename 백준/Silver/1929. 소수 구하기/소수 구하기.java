import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int M, N;
    static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        prime = new boolean[N + 1];

        // 모두 true로 초기화
        for (int i = 2; i <= N; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i <= N; i++) {
            if (prime[i]) { // 소수
                for (int j = i * i; j <= N; j += i) { // 배수를 false로 변환
                    prime[j] = false;
                }
            }
        }
        for (int i = M; i <= N; i++) {
            if (prime[i]) {
                System.out.println(i);
            }
        }
    }
}