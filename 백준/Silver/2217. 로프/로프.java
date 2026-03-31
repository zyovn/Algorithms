import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] weight;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        weight = new int[N];

        for (int i = 0; i < N; i++) {
            weight[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(weight);

        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, weight[i] * (N - i));
        }
        sb.append(max);

        br.close();
        bw.write(sb.toString());;
        bw.flush();
        bw.close();
    }
}