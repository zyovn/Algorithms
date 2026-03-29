import java.io.*;

public class Main {
    static long n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        n = Long.parseLong(br.readLine());

        sb.append(n * 4);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
