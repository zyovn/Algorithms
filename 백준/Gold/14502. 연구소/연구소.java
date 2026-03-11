import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        backTracking(0);

        sb.append(max);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void backTracking(int depth) {
        if (depth == 3) {
            bfs();
            return;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    map[i][j] = 1;
                    backTracking(depth + 1);
                    map[i][j] = 0;
                }
            }
        }
    }

    private static void bfs() {
        int[][] copyMap = new int[N][M];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                copyMap[i][j] = map[i][j];
                if (copyMap[i][j] == 2) queue.add(new int[]{i, j});
            }
        }

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cx = cur[0];
            int cy = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if (copyMap[nx][ny] == 1 || copyMap[nx][ny] == 2) continue;

                copyMap[nx][ny] = 2;
                queue.add(new int[]{nx, ny});
            }
        }
        countSafeArea(copyMap);
    }

    private static void countSafeArea(int[][] copyMap) {
        int temp = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (copyMap[i][j] == 0) temp++;
            }
        }
        max = Math.max(max, temp);
    }
}