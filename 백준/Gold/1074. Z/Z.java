import java.io.*;
import java.util.*;

public class Main {
    static int N, r, c, result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        division(0, 0, (int) Math.pow(2, N));

        sb.append(result);

        br.close();
        bw.write(sb.toString());;
        bw.flush();
        bw.close();
    }

    private static void division(int x, int y, int size) {
        if (size == 1) return;

        int half = size / 2;
        int area = half * half;

        if (r < x + half && c < y + half) {
            division(x, y, half);
        }
        if (r < x + half && c >= y + half) {
            result += area;
            division(x, y + half, half);
        }
        if (r >= x + half && c < y + half) {
            result += area * 2;
            division(x + half, y, half);
        }
        if (r >= x + half && c >= y + half) {
            result += area * 3;
            division(x + half, y + half, half);
        }
    }
}