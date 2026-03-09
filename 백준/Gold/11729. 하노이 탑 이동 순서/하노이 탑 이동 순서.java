import java.io.*;

public class Main {
    static int n;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());

        sb.append((int) Math.pow(2, n) - 1).append("\n");

        hanoi(n, 1, 2, 3);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void hanoi(int num, int from, int tmp, int to) {
        if (num == 1) {
            sb.append(from).append(" ").append(to).append("\n");
            return;
        }
        hanoi(num - 1, from, to, tmp);
        sb.append(from).append(" ").append(to).append("\n");
        hanoi(num - 1, tmp, from, to);
    }
}