import java.io.*;
import java.util.*;

public class Main {
    static int N, A, B, C;
    static long result;
    static boolean[] visited;
    static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
    static class Node {
        int next;
        long dist;

        Node(int next, long dist) {
            this.next = next;
            this.dist = dist;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        visited = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());

            // 인접한 것도 알아야 하므로 객체를 생성해서 넣음
            graph.get(A).add(new Node(B, C));
            graph.get(B).add(new Node(A, C));
        }
        dfs(1, 0);

        sb.append(result);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void dfs(int start, long dist) {
        visited[start] = true;
        result = Math.max(result, dist);

        for (Node nextNode : graph.get(start)) {
            if (!visited[nextNode.next]) {
                visited[nextNode.next] = true;
                dfs(nextNode.next, nextNode.dist + dist);
            }
        }
    }
}