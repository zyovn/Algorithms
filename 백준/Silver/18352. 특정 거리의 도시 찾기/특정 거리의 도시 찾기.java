import java.io.*;
import java.util.*;

public class Main {
    static int N, M, K, X, A, B;
    static int[] dist;
    static boolean[] visited;
    static ArrayList<Integer>[] list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        dist = new int[N + 1];
        visited = new boolean[N + 1];
        list = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            list[A].add(B);
        }
        bfs(X);

        for (int i = 1; i <= N; i++) {
            if (dist[i] == K) sb.append(i).append("\n");
        }
        if (sb.length() == 0) sb.append(-1);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        dist[start] = 0;
        visited[start] =true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (int next : list[cur]) {
                if (!visited[next]) {
                    visited[next] = true;
                    dist[next] = dist[cur] + 1;
                    queue.add(next);
                }
            }
        }
    }
}