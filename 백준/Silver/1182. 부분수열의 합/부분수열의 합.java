import java.io.*;
import java.util.*;

public class Main {
    static int N, S, count;
    static int[] seq;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        seq = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }
        backTracking(0, 0);

        if (S == 0) count--;

        sb.append(count);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void backTracking(int depth, int start) {
        if (depth == S) {
            count++;
        }

        for (int i = start; i < N; i++) {
            backTracking(depth + seq[i], i + 1);
        }
    }
}