import java.io.*;

public class Main {
    static String str;
    static String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        str = br.readLine();

        for (String s : croatia) {
            str = str.replace(s, " ");
        }
        sb.append(str.length());

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}