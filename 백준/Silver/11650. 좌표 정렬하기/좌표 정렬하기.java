import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] coordinate;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        coordinate = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            coordinate[i][0] = Integer.parseInt(st.nextToken());
            coordinate[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(coordinate, (o1, o2) -> {
            if (o1[0] == o2[0]) return o1[1] - o2[1];
            else return o1[0] - o2[0];
        });

        for (int i = 0; i < N; i++) {
            sb.append(coordinate[i][0]).append(" ").append(coordinate[i][1]).append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}