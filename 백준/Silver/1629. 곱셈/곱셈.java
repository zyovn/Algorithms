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

        sb.append(division(A, B, C));

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static long division(long a, long b, long c) {
        if (b == 1) return a % c;

        long result = division(a, b / 2, c);

        if (b % 2 == 0) return (result * result) % c;
        else return (result * result % c) * a % c;
    }
}