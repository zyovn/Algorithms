import java.io.*;
import java.util.*;

public class Main {
    static int T, n;
    static String clothes;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            int answer = 1;

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                clothes = st.nextToken();
                map.put(clothes, map.getOrDefault(clothes, 0) + 1);
            }

            for (int value : map.values()) {
                answer *= (value + 1);
            }
            sb.append(answer - 1).append("\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}