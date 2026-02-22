import java.io.*;
import java.util.*;

public class Main {
    private static class Node implements Comparable<Node>{
        int node;
        int cost;

        public Node(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }
    static int V, E, K;
    static ArrayList<Node>[] graph;
    static int[] dist;
    static boolean[] visited;
    static int INF = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(br.readLine());

        graph = new ArrayList[V + 1];
        dist = new int[V + 1];
        visited = new boolean[V + 1];

        for (int i = 1; i <= V; i++) {
            graph[i] = new ArrayList<>();
            dist[i] = INF;
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[u].add(new Node(v, w));
        }
        dijkstra(K);

        for (int i = 1; i <= V; i++) {
            if (dist[i] == INF) sb.append("INF").append("\n");
            else sb.append(dist[i]).append("\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void dijkstra (int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            int now = cur.node;

            if (visited[now]) continue;
            visited[now] = true;

            for (Node next : graph[now]) {
                if (dist[next.node] > dist[now] + next.cost) {
                    dist[next.node] = dist[now] + next.cost;
                    pq.add(new Node(next.node, dist[next.node]));
                }
            }
        }
    }
}