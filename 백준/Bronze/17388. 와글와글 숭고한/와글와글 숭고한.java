import java.io.*;
import java.util.*;

public class Main {
    static int S, K, H;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        S = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        int allPartRate = S + K + H;

        int min = Math.min(S, K);
        min = Math.min(min, H);

        if (allPartRate < 100) {
            if (min == S) sb.append("Soongsil");
            else if (min == K) sb.append("Korea");
            else sb.append("Hanyang");
        } else sb.append("OK");

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}