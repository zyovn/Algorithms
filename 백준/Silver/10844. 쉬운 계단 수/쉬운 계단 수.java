import java.io.*;

public class Main {
    static int N, answer;
    static int[][] dp;
    static final int MOD = 1000000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        dp = new int[N + 1][10];

        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j == 0) dp[i][j] = dp[i - 1][1] % MOD;
                else if (j == 9) dp[i][j] = dp[i - 1][8] % MOD;
                else dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % MOD;
            }
        }

        for (int i = 0; i <= 9; i++) {
            answer += dp[N][i];
            answer %= MOD;
        }
        sb.append(answer);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}