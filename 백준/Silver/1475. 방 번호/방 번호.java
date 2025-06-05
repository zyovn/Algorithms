import java.io.*;

public class Main {
    static String N;
    static int result;
    static int[] cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = br.readLine();
        cnt = new int[10];

        for (int i = 0; i < N.length(); i++) {
            int num = N.charAt(i) - '0';

            if (num == 6) num = 9;
            cnt[num]++;
        }
        cnt[6] = (cnt[6] + cnt[9] + 1) / 2;

        for (int i = 0; i < 9; i++) {
            result = Math.max(result, cnt[i]);
        }
        sb.append(result);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}