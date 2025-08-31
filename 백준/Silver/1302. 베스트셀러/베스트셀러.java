import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static String title, result;
    static HashMap<String, Integer> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            title = br.readLine();
            map.put(title, map.getOrDefault(title, 0) + 1);
        }

        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            if (max < value) {
                max = value;
                result = key;
            } else if (max == value && key.compareTo(result) < 0) {
                result = key;
            }
        }
        sb.append(result);

        br.close();
        bw.write(sb.toString());;
        bw.flush();
        bw.close();
    }
}