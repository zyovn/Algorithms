import java.io.*;
import java.util.*;

public class Main {
    static int R, C, sheep, wolf, totalSheep, totalWolf;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            map[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (!visited[i][j] && map[i][j] != '#') {
                    BFS(i, j);
                    if (sheep > wolf) totalSheep += sheep;
                    else totalWolf += wolf;
                }
            }
        }
        sb.append(totalSheep).append(" ").append(totalWolf);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    private static void BFS(int r, int c) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{r, c});
        visited[r][c] = true;
        sheep = 0;
        wolf = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cx = cur[0];
            int cy = cur[1];

            if (map[cx][cy] == 'o') sheep++;
            if (map[cx][cy] == 'v') wolf++;

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < 0 || nx >= R || ny < 0 || ny >= C) continue;
                if (visited[nx][ny] || map[nx][ny] == '#') continue;

                visited[nx][ny] = true;
                queue.add(new int[]{nx, ny});
            }
        }
    }
}