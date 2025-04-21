import java.io.*;
import java.util.*;

public class Main {
    private static class Assignment{
        int score;
        int time;

        Assignment(int score, int time) {
            this.score = score;
            this.time = time;
        }
    }
    static int N, A, T, result;
    static Stack<Assignment> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 새로운 과제 추가
            if (st.nextToken().charAt(0) == '1') {
                A = Integer.parseInt(st.nextToken());
                T = Integer.parseInt(st.nextToken());
                stack.push(new Assignment(A, T));
            } 
            // 과제 수행
            if (!stack.isEmpty()) {
                Assignment cur = stack.peek();
                cur.time--;

                if (cur.time == 0) {
                    result += cur.score;
                    stack.pop();
                }
            }
        }
        sb.append(result);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}