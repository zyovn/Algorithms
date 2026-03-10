import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] A;
    static int[] operator;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        A = new int[N];
        operator = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }
        backTracking(1, A[0]);

        sb.append(max).append("\n").append(min);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void backTracking(int depth, int num) {
        if (depth == N) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i]--;

                switch (i) {
                    case 0:
                        backTracking(depth + 1, num + A[depth]);
                        break;
                    case 1:
                        backTracking(depth + 1, num - A[depth]);
                        break;
                    case 2:
                        backTracking(depth + 1, num * A[depth]);
                        break;
                    case 3:
                        backTracking(depth + 1, num / A[depth]);
                        break;
                }
                operator[i]++;
            }
        }
    }
}