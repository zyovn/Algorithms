import java.io.*;
import java.util.*;

public class Main {
    static int A, B, C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(br.readLine());

        if (A + B >= (2 * C)) sb.append((A + B) - (2 * C));
        else sb.append(A + B);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}