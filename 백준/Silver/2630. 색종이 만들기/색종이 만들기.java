import java.io.*;
import java.util.*;

public class Main {
    static int N, white, blue;
    static int[][] paper;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        paper = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        division(0, 0, N);

        sb.append(white).append("\n").append(blue);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void division(int x, int y, int size) {
        int half = size / 2;
        if (isCheck(x, y, size)) {
            if (paper[x][y] == 0) white++;
            else blue++;
        } else {
            division(x, y, half);
            division(x + half, y, half);
            division(x, y + half, half);
            division(x + half, y + half, half);
        }
    }

    private static boolean isCheck(int x, int y, int size) {
        int color = paper[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (paper[i][j] != color) return false;
            }
        }
        return true;
    }
}