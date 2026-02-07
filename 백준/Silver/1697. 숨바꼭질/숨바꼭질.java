import java.io.*;
import java.util.*;

public class Main {
    static int N, K, time;
    static boolean[] isVisited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        isVisited = new boolean[100001];

        bfs(N, K);

        sb.append(time);

        br.close();
        bw.write(sb.toString());;
        bw.flush();
        bw.close();
    }

    private static void bfs(int start, int target) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, 0});
        isVisited[start] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curLoc = cur[0];
            int curTime = cur[1];

            if (curLoc == target) {
                time = curTime;
                return;
            }
            int[] nextLoc = {curLoc - 1, curLoc + 1, curLoc * 2};

            for (int i = 0; i < 3; i++) {
                int next = nextLoc[i];

                if (next >= 0 && next <= 100000 && !isVisited[next]) {
                    queue.add(new int[]{next, curTime + 1});
                    isVisited[next] = true;
                }
            }
        }
    }
}
