import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, r, c, d, cnt; // 방의 크기, 로봇 청소기 칸 좌표, 방향, 청소하는 칸의 개수
    static int[][] room;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0}; // 북 동 남 서
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        room = new int[N][M];
        visited = new boolean[N][M];
        cnt = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                room[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        BFS(r, c, d);
        System.out.println(cnt);
    }

    private static void BFS(int x, int y, int dir) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y, dir});
        visited[x][y] = true;
        cnt++;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cx = cur[0];
            int cy = cur[1];
            int cdir = cur[2];

            boolean cleaned = false; // 청소 미완료 = 전진일 경우
            for (int i = 0; i < 4; i++) {
                cdir = (cdir + 3) % 4;
                int nx = cx + dx[cdir];
                int ny = cy + dy[cdir];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
                    continue;
                }
                if (!visited[nx][ny] && room[nx][ny] == 0) { // 방문 X, 청소 미완료
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, cdir});
                    cnt++;
                    cleaned = true;
                    break;
                }
            }
            if (!cleaned) { // 청소 완료 = 후진일 경우
                int bdir = (cdir + 2) % 4;
                int bx = cx + dx[bdir];
                int by = cy + dy[bdir];

                if (bx < 0 || bx >= N || by < 0 || by >= M) {
                    continue;
                }
                if (room[bx][by] == 0) { // 후진 가능
                    queue.add(new int[]{bx, by, cdir});
                } else { // 후진 불가능 -> 작동 종료
                    break;
                }
            }
        }
    }
}