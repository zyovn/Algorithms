import java.io.*;
import java.util.*;

public class Main {
    static int H, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        H = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        if (M < 45) {
            H = H - 1;
            M = M + 15;

            if (H < 0) H = 23;

        } else M = M - 45;

        sb.append(H).append(" ").append(M);

        br.close();
        bw.write(sb.toString());;
        bw.flush();
        bw.close();
    }
}