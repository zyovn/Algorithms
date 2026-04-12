import java.io.*;
import java.util.*;

public class Main {
    static int T;
    static int[][] chess;
    static boolean[][] visited;
    static int[] dx = {-2, -2, 2, 2, -1, -1, 1, 1};
    static int[] dy = {1, -1, 1, -1, 2, -2, 2, -2};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int I = Integer.parseInt(br.readLine());
            chess = new int[I][I];
            visited = new boolean[I][I];

            StringTokenizer st = new StringTokenizer(br.readLine());
            int curX = Integer.parseInt(st.nextToken());
            int curY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int desX = Integer.parseInt(st.nextToken());
            int desY = Integer.parseInt(st.nextToken());

            sb.append(bfs(curX, curY, desX, desY, I)).append("\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static int bfs(int x, int y, int desX, int desY, int I) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cx = cur[0];
            int cy = cur[1];

            if (cx == desX && cy == desY) return chess[cx][cy];

            for (int i = 0; i < 8; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < 0 || nx >= I || ny < 0 || ny >= I) continue;
                if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    chess[nx][ny] = chess[cx][cy] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
        return 0;
    }
}