import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static String name, input;
    static HashMap<Integer, String> numMap = new HashMap<>();;
    static HashMap<String, Integer> nameMap = new HashMap<>();;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            name = br.readLine();
            numMap.put(i + 1, name);
            nameMap.put(name, i + 1);
        }

        for (int i = 0; i < M; i++) {
            input = br.readLine();
            if (Character.isDigit(input.charAt(0))) {
                int key = Integer.parseInt(input);
                sb.append(numMap.get(key)).append("\n");
            }
            else sb.append(nameMap.get(input)).append("\n");
        }
        br.close();
        bw.write(sb.toString());;
        bw.flush();
        bw.close();
    }
}