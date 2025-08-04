import java.io.*;
import java.util.*;

public class Main {
    static long A, B, C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());

        long sum = A + B + C;

        sb.append(sum);

        br.close();
        bw.write(sb.toString());;
        bw.flush();
        bw.close();
    }
}