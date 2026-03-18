import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] info;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            if (Math.abs(o1) == Math.abs(o2)) return o1 - o2;
            return Math.abs(o1) - Math.abs(o2);
        });

        N = Integer.parseInt(br.readLine());
        info = new int[N];
        
        for (int i = 0; i < N; i++) {
            info[i] = Integer.parseInt(br.readLine());

            if (info[i] == 0) {
                if (pq.isEmpty()) sb.append(0).append("\n");
                else {
                    sb.append(pq.peek()).append("\n");
                    pq.poll();
                }
            } else pq.offer(info[i]);
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}