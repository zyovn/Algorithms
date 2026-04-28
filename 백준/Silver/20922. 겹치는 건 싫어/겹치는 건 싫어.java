import java.io.*;
import java.util.*;

public class Main {
    static int K, N;
    static int[] seq, cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        seq = new int[N];
        cnt = new int[100001];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0, start = 0, end = 0;
        while (end < N) {
            if (cnt[seq[end]] < K) {
                cnt[seq[end]]++;
                end++;
            } else {
                cnt[seq[start]]--;
                start++;
            }
            max = Math.max(max, end - start);
        }
        sb.append(max);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
