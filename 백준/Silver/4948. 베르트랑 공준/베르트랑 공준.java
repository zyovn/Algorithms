import java.io.*;

public class Main {
    static int n;
    static boolean[] isComposite;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            n = Integer.parseInt(br.readLine());
            isComposite = new boolean[n * 2 + 1];

            if (n == 0) break;

            for (int i = 2; i <= n * 2; i++) {
                if (!isComposite[i]) {
                    for (int j = i * 2; j <= n * 2; j += i) {
                        isComposite[j] = true;
                    }
                }
            }

            int cnt = 0;
            for (int i = n + 1; i <= n * 2; i++) {
                if (!isComposite[i]) cnt++;
            }
            sb.append(cnt).append("\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}