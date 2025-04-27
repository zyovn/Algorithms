import java.io.*;

public class Main {
    static int N;
    static int[] dp, stair;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];
        stair = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }
        if (N >= 1) dp[1] = stair[1];
        if (N >= 2) dp[2] = stair[1] + stair[2];

        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i - 3] + stair[i - 1], dp[i - 2]) + stair[i];
        }
        sb.append(dp[N]);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}