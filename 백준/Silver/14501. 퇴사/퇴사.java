import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] dp, T, P;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];
        T = new int[N];
        P = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);
            
            if (i + T[i] < N + 1) {
                dp[i + T[i]] = Math.max(dp[i + T[i]], dp[i] + P[i]);
            }
        }
        sb.append(dp[N]);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}