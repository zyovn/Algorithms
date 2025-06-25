import java.io.*;

public class Main {
    static int result;
    static int[] score, prefix;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        score = new int[11];
        prefix = new int[11];

        for (int i = 1; i <= 10; i++) {
            score[i] = Integer.parseInt(br.readLine());
            prefix[i] = prefix[i - 1] + score[i];
        }

        result = prefix[1];
        for (int i = 2; i <= 10; i++) {
            if (Math.abs(prefix[i] - 100) < Math.abs(result - 100)) result = prefix[i];
            else if (Math.abs(prefix[i] - 100) == Math.abs(result - 100)) result = Math.max(prefix[i], result);
        }
        sb.append(result);

        br.close();
        bw.write(sb.toString());;
        bw.flush();
        bw.close();
    }
}