import java.io.*;
import java.util.*;

public class Main {
    static int N, M, result;
    static char[][] rect;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        rect = new char[N][M];

        for (int i = 0; i < N; i++) {
            rect[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < N; i++) { // 행
            for (int j = 0; j < M; j++) { // 열
                for (int k = 0; i + k < N && j + k < M; k++) { // 정사각형
                    if (rect[i][j] == rect[i][j + k] &&
                        rect[i][j] == rect[i + k][j] &&
                        rect[i][j] == rect[i + k][j + k]) {
                        result = Math.max(result, (k + 1) * (k + 1)); // 갱신
                    }
                }
            }
        }
        sb.append(result);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}