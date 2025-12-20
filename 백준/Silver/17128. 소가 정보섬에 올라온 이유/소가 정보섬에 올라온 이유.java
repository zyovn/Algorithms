import java.io.*;
import java.util.*;

public class Main {
    static int N, Q, sum;
    static int[] A, S, qNum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());
        A = new int[N + 1];
        S = new int[N + 1];
        qNum = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < Q; i++) {
            qNum[i] = Integer.parseInt(st.nextToken()) - 1;
        }

        for (int i = 0; i < N; i++) {
            S[i] = A[i] * A[(i + 1) % N] * A[(i + 2) % N] * A[(i + 3) % N];
            sum += S[i];
        }

        for (int i = 0; i < Q; i++) {
            int target = qNum[i];

            for (int j = 0; j < 4; j++) {
                int idx = (target - j + N) % N;
                sum -= S[idx];
            }
            A[target] *= -1;

            for (int j = 0; j < 4; j++) {
                int idx = (target - j + N) % N;
                S[idx] = A[idx] * A[(idx + 1) % N] * A[(idx + 2) % N] * A[(idx + 3) % N];
                sum += S[idx];
            }
            sb.append(sum).append("\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}