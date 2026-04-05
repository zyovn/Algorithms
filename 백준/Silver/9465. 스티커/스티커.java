import java.io.*;
import java.util.*;

public class Main {
    static int T, n;
    static int[][] sticker, dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        while (T --> 0) {
            n = Integer.parseInt(br.readLine());
            sticker = new int[2][n + 1];
            dp = new int[2][n + 1];

            StringTokenizer st1 = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for (int j = 1; j <= n; j++) {
                sticker[0][j] = Integer.parseInt(st1.nextToken());
                sticker[1][j] = Integer.parseInt(st2.nextToken());
            }
            dp[0][1] = sticker[0][1];
            dp[1][1] = sticker[1][1];

            for (int j = 2; j <= n; j++) {
                dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + sticker[0][j];
                dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + sticker[1][j];
            }
            sb.append(Math.max(dp[0][n], dp[1][n])).append("\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}