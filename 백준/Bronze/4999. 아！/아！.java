import java.io.*;

public class Main {
    static String input1, input2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        input1 = br.readLine();
        input2 = br.readLine();

        if (input1.length() >= input2.length()) sb.append("go");
        else sb.append("no");

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}