import java.io.*;

public class Main {
    static int N, result;
    static int[] chess;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        chess = new int[N];

        backTracking(0);

        sb.append(result);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void backTracking(int depth) {
        if (depth == N) {
            result++;
            return;
        }

        for (int i = 0; i < N; i++) {
            chess[depth] = i;
            if (isPossible(depth)) backTracking(depth + 1);
        }
    }

    private static boolean isPossible(int row) {
        for (int i = 0; i < row; i++) {
            if (chess[i] == chess[row]) return false;
            else if (Math.abs(row - i) == Math.abs(chess[row] - chess[i])) return false;
        }
        return true;
    }
}