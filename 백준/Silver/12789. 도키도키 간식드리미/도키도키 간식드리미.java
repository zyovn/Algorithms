import java.io.*;
import java.util.*;

public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        int num = 1;
        while (!queue.isEmpty()) {
            if (queue.peek() == num) {
                queue.poll();
                num++;
            } else if (!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                num++;
            } else stack.push(queue.poll());
        }
        // 원본 줄 사람 X, 대기열 사람 O일 때도 확인 필요
        while (!stack.isEmpty()) {
            if (stack.peek() == num) {
                stack.pop();
                num++;
            } else break;
        }
        if (stack.isEmpty()) sb.append("Nice");
        else sb.append("Sad");

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}