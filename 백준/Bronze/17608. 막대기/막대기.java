import java.io.*;
import java.util.Stack;

public class Main {
    static int N, h, cnt;
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            h = Integer.parseInt(br.readLine());
            stack.push(h);
        }

        int max = 0;
        while (!stack.isEmpty()) {
            int now = stack.pop();
            if (now > max) {
                max = now;
                cnt++;
            }
        }
        sb.append(cnt);

        br.close();
        bw.write(sb.toString());;
        bw.flush();
        bw.close();
    }
}