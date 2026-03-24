import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] region;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int max = Integer.MIN_VALUE;
    static int maxHeight = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        region = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                region[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight, region[i][j]);
            }
        }

        for (int h = 0; h < maxHeight; h++) {
            int cnt = 0;
            visited = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j] && region[i][j] > h) {
                        dfs(i, j, h);
                        cnt++;
                    }
                }
            }
            max = Math.max(max, cnt);
        }
        sb.append(max);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void dfs(int x, int y, int height) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue;
            if (!visited[nx][ny] && region[nx][ny] > height) dfs(nx, ny, height);
        }
    }
}