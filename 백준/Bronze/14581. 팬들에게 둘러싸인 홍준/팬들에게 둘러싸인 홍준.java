import java.io.*;

public class Main {
    static String id;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        id = br.readLine();

        sb
                .append(":fan::fan::fan:").append("\n")
                .append(":fan:").append(":").append(id).append(":").append(":fan:").append("\n")
                .append(":fan::fan::fan:");

        br.close();
        bw.write(sb.toString());;
        bw.flush();
        bw.close();
    }
}