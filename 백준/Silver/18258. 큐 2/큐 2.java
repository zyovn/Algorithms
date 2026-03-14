import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static String cmd;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int end = -1;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cmd = st.nextToken();

            switch (cmd) {
                case "push":
                    end = Integer.parseInt(st.nextToken());
                    queue.add(end);
                    break;
                case "pop":
                    if (!queue.isEmpty()) sb.append(queue.poll()).append("\n");
                    else sb.append(-1).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "front":
                    if (!queue.isEmpty()) sb.append(queue.peek()).append("\n");
                    else sb.append(-1).append("\n");
                    break;
                case "back":
                    if (!queue.isEmpty()) sb.append(end).append("\n");
                    else sb.append(-1).append("\n");
                    break;
            }
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}