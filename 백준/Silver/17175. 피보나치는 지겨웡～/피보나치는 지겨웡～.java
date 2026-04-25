import java.io.*;

public class Main {
    static int n;
    static int[] dp;
    static int MOD = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());

        dp = new int[n + 1];
        dp[0] = 1;
        if (n >= 1) dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = (1 + dp[i - 1] + dp[i - 2]) % MOD;
        }
        sb.append(dp[n]);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}