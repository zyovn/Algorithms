import java.io.*;

public class Main {
    static int result;
    static String exp;
    static String[] split;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        exp = br.readLine();
        split = exp.split("-");

        for (int i = 0; i < split.length; i++) {
            int tmp = 0;
            for (String s : split[i].split("\\+")) {
                tmp += Integer.parseInt(s);
            }
            if (i == 0) result += tmp;
            else result -= tmp;
        }
        sb.append(result);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}