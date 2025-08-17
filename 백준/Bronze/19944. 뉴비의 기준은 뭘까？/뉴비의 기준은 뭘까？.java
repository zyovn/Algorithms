import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        if (M <= N) {
            if (M == 1 || M == 2) sb.append("NEWBIE!");
            else sb.append("OLDBIE!");
        } else sb.append("TLE!");

        br.close();
        bw.write(sb.toString());;
        bw.flush();
        bw.close();
    }
}