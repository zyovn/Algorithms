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

        for (int i = 0; i < T; i++) {
            n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();

            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                clothes = st.nextToken();
                map.put(clothes, map.getOrDefault(clothes, 0) + 1);
            }
            int result = 1;

            for (int cnt : map.values()) {
                result *= (cnt + 1);
            }
            sb.append(result - 1).append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}