import java.io.*;

public class Main {
    static int N;
    static String name;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            name = br.readLine();

            for (int j = 0; j < name.length(); j++) {
                char ch = name.charAt(j);
                if (ch == 'S') sb.append(name);
            }
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
