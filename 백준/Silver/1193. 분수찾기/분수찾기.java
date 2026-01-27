import java.io.*;

public class Main {
    static int X, cnt, sum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        X = Integer.parseInt(br.readLine());
        cnt = 1;

        while (true) {
            if (X <= cnt + sum) {
                if (cnt % 2 == 1) sb.append(cnt - (X - sum) + 1).append("/").append(X - sum);
                else sb.append(X - sum).append("/").append(cnt - (X - sum) + 1);
                break;
            } else {
                sum += cnt;
                cnt++;
            }
        }
        br.close();
        bw.write(sb.toString());;
        bw.flush();
        bw.close();
    }
}