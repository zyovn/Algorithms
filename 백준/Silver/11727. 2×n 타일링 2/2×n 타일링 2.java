import java.io.*;

public class Main {
    static int n;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        dp = new int[1001];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 3;

        for (int i = 3; i <= n; i++) {
            dp[i] = ((dp[i - 2] * 2) + dp[i - 1]) % 10007;
        }
        sb.append(dp[n]);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}