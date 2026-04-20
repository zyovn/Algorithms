import java.io.*;
import java.util.*;

public class Main {
    static int N, K, time;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        visited = new boolean[100001];

        bfs(N, K);

        sb.append(time);

        br.close();
        bw.write(sb.toString());;
        bw.flush();
        bw.close();
    }

    private static void bfs(int start, int target) {
        Deque<int[]> deque = new LinkedList<>();
        deque.add(new int[]{start, 0});
        visited[start] = true;

        while (!deque.isEmpty()) {
            int[] cur = deque.poll();
            int curLoc = cur[0];
            int curTime = cur[1];

            if (curLoc == target) {
                time = curTime;
                return;
            }
            int[] nextLoc = {curLoc * 2, curLoc - 1, curLoc + 1};

            for (int i = 0; i < 3; i++) {
                int next = nextLoc[i];

                if (next < 0 || next > 100000 || visited[next]) continue;
                if (i == 0) deque.addFirst(new int[]{next, curTime});
                else deque.addLast(new int[]{next, curTime + 1});

                visited[next] = true;
            }
        }
    }
}