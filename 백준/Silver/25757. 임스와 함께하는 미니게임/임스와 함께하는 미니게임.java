import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static String game;
    static HashSet<String> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        game = st.nextToken();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        if (game.equals("Y")) sb.append(set.size());
        else if (game.equals("F")) sb.append(set.size() / 2);
        else sb.append(set.size() / 3);
        
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}