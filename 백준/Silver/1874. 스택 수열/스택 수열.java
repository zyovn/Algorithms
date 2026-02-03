import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] seq;
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        seq = new int[n];
        int num = 1;

        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(br.readLine());

            while (seq[i] >= num) {
                stack.push(num);
                num++;
                sb.append("+").append("\n");
            }

            if (stack.peek() == seq[i]) {
                stack.pop();
                sb.append("-").append("\n");
            } else {
                bw.write("NO");
                bw.flush();
                return;
            }
        }
        br.close();
        bw.write(sb.toString());;
        bw.flush();
        bw.close();
    }
}