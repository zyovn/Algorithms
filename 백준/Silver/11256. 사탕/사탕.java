import java.io.*;
import java.util.*;

public class Main {
    static int T, J, N, R, C;
    static int[] size;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            J = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            size = new int[N];
            int cnt = 0;

            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                R = Integer.parseInt(st.nextToken());
                C = Integer.parseInt(st.nextToken());
                size[j] = R * C;
            }
            Arrays.sort(size);

            for (int j = N - 1; j >= 0; j--) {
                cnt++;
                J -= size[j];
                if (J <= 0) break;
            }
            sb.append(cnt).append("\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
