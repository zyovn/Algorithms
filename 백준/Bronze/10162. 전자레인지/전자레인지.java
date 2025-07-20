import java.io.*;

public class Main {
    static int T;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        int A = 300;
        int B = 60;
        int C = 10;

        if (T % 10 != 0) sb.append("-1");
        else {
            int a = T / A;

            T %= A;
            int b = T / B;

            T %= B;
            int c = T / C;

            sb.append(a).append(" ").append(b).append(" ").append(c);
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}