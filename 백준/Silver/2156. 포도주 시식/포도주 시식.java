import java.io.*;

public class Main {
    static int n;
    static int[] wine, dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        wine = new int[n + 1];
        dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }
        dp[1] = wine[1];

        if (n >= 2) dp[2] = wine[1] + wine[2];

        for (int i = 3; i <= n ; i++) {
            dp[i] = Math.max(
                    dp[i - 1],
                    Math.max(dp[i - 2] + wine[i], dp[i - 3] + wine[i - 1] + wine[i])
            );
        }
        sb.append(dp[n]);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}