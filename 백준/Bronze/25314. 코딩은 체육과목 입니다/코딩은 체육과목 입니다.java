import java.io.*;

public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N / 4; i++) {
            sb.append("long").append(" ");
        }
        sb.append("int");

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}