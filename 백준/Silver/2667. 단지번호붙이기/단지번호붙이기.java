import java.io.*;
import java.util.*;

public class Main {
    static int N, cnt, allCnt;
    static int[][] map;
    static boolean[][] isVisited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static ArrayList<Integer> houseCnt = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        isVisited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !isVisited[i][j]) {
                    cnt = 0;
                    dfs(i, j);
                    allCnt++;
                    houseCnt.add(cnt);
                }
            }
        }
        sb.append(allCnt).append("\n");

        Collections.sort(houseCnt);
        for (int cnt : houseCnt) {
            sb.append(cnt).append("\n");
        }
        br.close();
        bw.write(sb.toString());;
        bw.flush();
        bw.close();
    }

    private static void dfs(int x, int y) {
        isVisited[x][y] = true;
        cnt++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue;
            if (map[nx][ny] == 0 || isVisited[nx][ny]) continue;

            dfs(nx, ny);
        }
    }
}