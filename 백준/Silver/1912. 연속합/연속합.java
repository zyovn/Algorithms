import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] arr, dp;
    static int result = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        dp = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = arr[i];
        }

        for (int i = 1; i <= n; i++) {
            dp[i] = Math.max(dp[i], dp[i - 1] + arr[i]);
            result = Math.max(result, dp[i]);
        }
        sb.append(result);

        br.close();
        bw.write(sb.toString());;
        bw.flush();
        bw.close();
    }
}