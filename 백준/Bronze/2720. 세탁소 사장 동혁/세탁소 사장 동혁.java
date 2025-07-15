import java.io.*;

public class Main {
    static int T, C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int q = 25;
        int d = 10;
        int n = 5;
        int p = 1;

        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            C = Integer.parseInt(br.readLine());
            sb.append(C / q).append(" ");

            C %= q;
            sb.append(C / d).append(" ");

            C %= d;
            sb.append(C / n).append(" ");

            C %= n;
            sb.append(C / p).append("\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}