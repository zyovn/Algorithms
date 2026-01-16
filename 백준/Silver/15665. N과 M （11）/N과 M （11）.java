import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] arr, result;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        result = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        backTracking(0);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void backTracking(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        int prev = -1;
        for (int i = 0; i < N; i++) {
            if (arr[i] == prev) continue;
            result[depth] = arr[i];
            prev = arr[i];
            backTracking(depth + 1);
        }
    }
}