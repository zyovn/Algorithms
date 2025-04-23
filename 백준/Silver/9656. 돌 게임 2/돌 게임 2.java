import java.io.*;

public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        if (N % 2 == 0) sb.append("SK");
        else sb.append("CY");

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}