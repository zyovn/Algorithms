import java.io.*;
import java.util.*;

public class Main {
    static String A, B;
    static int min, max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        A = st.nextToken();
        B = st.nextToken();

        String minA = A.replaceAll("6", "5");
        String minB = B.replaceAll("6", "5");

        min = Integer.parseInt(minA) + Integer.parseInt(minB);

        String maxA = A.replaceAll("5", "6");
        String maxB = B.replaceAll("5", "6");

        max = Integer.parseInt(maxA) + Integer.parseInt(maxB);

        sb.append(min).append(" ").append(max);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}