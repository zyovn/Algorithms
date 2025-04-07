import java.io.*;
import java.util.*;

public class Main {
    static int N, end;
    static String cmd;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue = new LinkedList<>();
        N = Integer.parseInt(br.readLine());
        end = -1;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cmd = st.nextToken();

            switch (cmd) {
                case "push":
                    end = Integer.parseInt(st.nextToken());
                    queue.add(end);
                    break;
                case "pop":
                    if (queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(queue.remove()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "front":
                    if (queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(queue.peek()).append("\n");
                    break;
                case "back":
                    if (queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(end).append("\n");
                    break;
            }
        }
        br.close();
        bw.write(sb + "");
        bw.flush();
        bw.close();
    }
}