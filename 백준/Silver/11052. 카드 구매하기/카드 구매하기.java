import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] P; // 카드팩 가격
    static int[] dp; // 금액의 최댓값
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        P = new int[N + 1];
        dp = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= N; i++) { // 구매할 카드 개수
            for (int j = 1; j <= i; j++) { // 카드팩 크기
                dp[i] = Math.max(dp[i], dp[i - j] + P[j]);
            }
        }
        System.out.println(dp[N]);
    }
}