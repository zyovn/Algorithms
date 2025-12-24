import java.io.*;
import java.math.BigInteger;

public class Main {
    static BigInteger N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = new BigInteger(br.readLine());
        sb.append(N.sqrt());

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}