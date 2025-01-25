import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int T, N;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        dp = new int[41][2]; // [n][0] = 0의 호출 횟수, [n][1] = 1의 호출 횟수

        dp[0][0] = 1; // fib(0) 호출 시 0의 횟수
        dp[0][1] = 0; // fib(0) 호출 시 1의 횟수
        dp[1][0] = 0; // fib(1) 호출 시 0의 횟수
        dp[1][1] = 1; // fib(1) 호출 시 1의 횟수

        for (int i = 2; i < 41; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            sb.append(dp[N][0]).append(" ").append(dp[N][1]).append("\n");
        }

        System.out.println(sb);
    }
}