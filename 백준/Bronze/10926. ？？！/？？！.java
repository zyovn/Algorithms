import java.io.*;

public class Main {
    static String id;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        id = br.readLine();
        sb.append(id).append("??!");

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}