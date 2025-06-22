import java.io.*;

public class Main {
    static int y;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        y = Integer.parseInt(br.readLine());
        sb.append(y - 543);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}