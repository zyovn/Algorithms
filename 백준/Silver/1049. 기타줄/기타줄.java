import java.io.*;
import java.util.*;

public class Main {
    static int N, M, pack, piece, price;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        pack = 1000;
        piece = 1000;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            pack = Math.min(pack, Integer.parseInt(st.nextToken()));
            piece = Math.min(piece, Integer.parseInt(st.nextToken()));
        }
        
        if (pack > piece * 6) price = piece * N;
        else price = Math.min(((N / 6) + 1) * pack, ((N / 6) * pack + (N % 6) * piece));

        sb.append(price);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}