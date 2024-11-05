import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static final int INF = Integer.MAX_VALUE;
    static int N, M;
    static ArrayList<int[]>[] graph;
    static int[] dist;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine()); //도시의 개수
        M = Integer.parseInt(br.readLine()); //버스의 개수

        graph = new ArrayList[N + 1];
        dist = new int[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++){
            graph[i] = new ArrayList<>();
            dist[i] = INF;
        }

        for (int i =0; i < M ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int stBus = Integer.parseInt(st.nextToken());
            int laBUs = Integer.parseInt(st.nextToken()); //인접 노드
            int weight = Integer.parseInt(st.nextToken()); //가중치
            graph[stBus].add(new int[]{laBUs, weight});
        }
        StringTokenizer st = new StringTokenizer(br.readLine());

        int startCity = Integer.parseInt(st.nextToken());
        int endCity = Integer.parseInt(st.nextToken());

        dijkstra(startCity);
        System.out.println(dist[endCity]);
    }
    private static void dijkstra (int start) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o1[0] - o2[0]);
        queue.add(new int[]{0, start});
        dist[start] = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curDist = cur[0];
            int curNode = cur[1];

            if (curDist > dist[curNode]) continue; //더 짧은 거리로 방문했을 시, 스킵

            for (int[] edge : graph[curNode]) {
                int nNode = edge[0]; //인접 노드
                int weight = edge[1]; //가중치

                if (!visited[nNode] && dist[nNode] > curDist + weight) {
                    dist[nNode] = curDist + weight; //거리 갱신
                    queue.add(new int[] {dist[nNode], nNode});
                }
            }
        }
    }
}
