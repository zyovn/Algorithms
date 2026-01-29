import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static char[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new char[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = str.charAt(j);
            }
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                result = Math.min(result, recolorChess(i, j));
            }
        }
        sb.append(result);

        br.close();
        bw.write(sb.toString());;
        bw.flush();
        bw.close();
    }

    private static int recolorChess(int row, int col) {
        int wCnt = 0;
        int bCnt = 0;

        for (int i = row; i < row + 8; i++) {
            for (int j = col; j < col + 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (board[i][j] != 'W') wCnt++;
                    else bCnt++;
                } else {
                    if (board[i][j] != 'W') bCnt++;
                    else wCnt++;
                }
            }
        }
        return Math.min(wCnt, bCnt);
    }
}