import java.io.*;

public class Main {
    static int N;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        dp = new int[1001];

        dp[1] = 1;
        dp[2] = 0;
        dp[3] = 1;
        dp[4] = 1;

        for (int i = 5; i <= N; i++) {
            if (dp[i - 1] == 0 || dp [i - 3] == 0 || dp[i - 4] == 0) dp[i] = 1;
            else dp[i] = 0;
        }
        if (dp[N] == 1) sb.append("SK");
        else sb.append("CY");

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}