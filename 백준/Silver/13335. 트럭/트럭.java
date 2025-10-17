import java.io.*;
import java.util.*;

public class Main {
    static int n, w, L, a;
    static Queue<Integer> truck = new LinkedList<>();
    static Queue<Integer> bridge = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        int time = 0;
        int curWeight = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a = Integer.parseInt(st.nextToken());
            truck.add(a);
        }

        for (int i = 0; i < w; i++) {
            bridge.add(0);
        }

        while (!bridge.isEmpty()) {
            time++;
            curWeight -= bridge.poll();

            if (!truck.isEmpty()) {
                if (curWeight + truck.peek() <= L) {
                    int nextTruck = truck.poll();
                    curWeight += nextTruck;
                    bridge.add(nextTruck);
                } else {
                    bridge.add(0);
                }
            }
        }

        sb.append(time);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}