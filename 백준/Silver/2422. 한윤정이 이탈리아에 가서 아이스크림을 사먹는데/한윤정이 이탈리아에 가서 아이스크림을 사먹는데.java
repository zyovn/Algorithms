import java.io.*;
import java.util.*;

public class Main {
    static int N, M, num1, num2;
    static boolean[][] notMixed;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        notMixed = new boolean[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            notMixed[num1][num2] = notMixed[num2][num1] = true;
        }

        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                for (int k = j + 1; k <= N; k++) {
                    if (!notMixed[i][j] && !notMixed[i][k] && !notMixed[j][k]) count++;
                }
            }
        }
        sb.append(count);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}