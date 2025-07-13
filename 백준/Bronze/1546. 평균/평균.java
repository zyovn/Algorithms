import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static double sum, result;
    static double[] score;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        score = new double[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            score[i] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(score);

        for (int i = 0; i < N; i++) {
            score[i] = score[i] / score[N - 1] * 100;
        }

        for (int i = 0; i < N; i++) {
            sum += score[i];
        }
        result = sum / N;
        sb.append(result);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}