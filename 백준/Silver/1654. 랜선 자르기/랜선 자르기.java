import java.io.*;
import java.util.*;

public class Main {
    static int K, N, max;
    static long result;
    static int[] cable;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        cable = new int[K];

        for (int i = 0; i < K; i++) {
            cable[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, cable[i]);
        }
        binarySearch();

        sb.append(result);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void binarySearch() {
        long left = 1;
        long right = max;

        while (left <= right) {
            long mid = (left + right) / 2;
            long cnt = 0;

            for (int i = 0; i < K; i++) {
                cnt += cable[i] / mid;
            }
            if (cnt >= N) {
                result = mid;
                left = mid + 1;
            } else right = mid - 1;
        }
    }
}