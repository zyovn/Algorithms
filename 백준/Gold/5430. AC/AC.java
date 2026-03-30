import java.io.*;
import java.util.*;

public class Main {
    static int T, n;
    static String p, num;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            p = br.readLine();
            n = Integer.parseInt(br.readLine());
            num = br.readLine();
            Deque<Integer> deque = new LinkedList<>();

            num = num.substring(1, num.length() - 1);
            if (!num.isEmpty()) {
                String[] arr = num.split(",");
                for (String s : arr) {
                    deque.add(Integer.parseInt(s));
                }
            }

            boolean isReverse = false;
            boolean isError = false;

            for (char func : p.toCharArray()) {
                if (func == 'R') isReverse = !isReverse;
                else if (func =='D') {
                    if (deque.isEmpty()) {
                        sb.append("error").append("\n");
                        isError = true;
                        break;
                    }
                    else if (isReverse) deque.removeLast();
                    else deque.removeFirst();
                }
            }
            if (isError) continue;

            sb.append("[");
            while (!deque.isEmpty()) {
                if (isReverse) sb.append(deque.removeLast());
                else sb.append(deque.removeFirst());

                if (!deque.isEmpty()) sb.append(",");
            }
            sb.append("]").append("\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
