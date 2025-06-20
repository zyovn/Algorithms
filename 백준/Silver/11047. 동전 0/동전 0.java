import java.io.*;
import java.util.*;

public class Main {
    static int N, K, cnt;
    static int[] coins;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        coins = new int[N];

        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        for (int i = N - 1; i >= 0; i--) {
            if (K >= coins[i]) {
                cnt += K / coins[i];
                K = K % coins[i];
            }
        }
        sb.append(cnt);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}