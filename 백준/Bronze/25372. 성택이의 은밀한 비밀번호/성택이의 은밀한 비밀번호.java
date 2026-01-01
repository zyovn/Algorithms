import java.io.*;

public class Main {
    static int N;
    static String str;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            str = br.readLine();
            if (str.length() >= 6 && str.length() <= 9) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}