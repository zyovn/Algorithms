import java.io.*;

public class Main {
    static String str;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        str = br.readLine();

        int code = str.charAt(0);
        sb.append(code);

        br.close();
        bw.write(sb.toString());;
        bw.flush();
        bw.close();
    }
}