import java.io.*;

public class Main {
    static int N;
    static boolean[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        dp = new boolean[1001];

        dp[1] = false;
        dp[2] = true;
        dp[3] = false;
        dp[4] = true;

        for (int i = 5; i <= N; i++) {
            if (!dp[i - 1] || !dp [i - 3] || !dp[i - 4]) dp[i] = true;
            else dp[i] = false;
        }
        if (dp[N]) sb.append("SK");
        else  sb.append("CY");

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}