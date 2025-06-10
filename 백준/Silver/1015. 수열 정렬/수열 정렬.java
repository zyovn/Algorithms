import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] A, P;
    static boolean[] isCheck;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        A = new int[N];
        P = new int[N];
        isCheck = new boolean[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            P[i] = A[i];
        }
        Arrays.sort(P);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i] == P[j] && !isCheck[j]) {
                    sb.append(j).append(" ");
                    isCheck[j] = true;
                    break;
                }
            }
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}