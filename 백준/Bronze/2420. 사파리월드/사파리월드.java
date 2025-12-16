import java.io.*;
import java.util.*;

public class Main {
    static long N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        sb.append(Math.abs(N - M));

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}