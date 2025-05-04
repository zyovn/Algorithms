import java.io.*;

public class Main {
    static int N;
    static String[] file;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        file = new String[N];

        for (int i = 0; i < N; i++) {
            file[i] = br.readLine();
        }

        for (int i = 0; i < file[0].length(); i++) {
            boolean isPattern = true;
            char ch = file[0].charAt(i);

            for (int j = 0; j < N; j++) {
                if (file[j].charAt(i) != ch) {
                    isPattern = false;
                    break;
                }
            }
            if (isPattern) sb.append(ch);
            else sb.append("?");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}