import java.io.*;

public class Main {
    static int money, cnt;
    static int[] change = {500, 100, 50, 10, 5, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        money = 1000 - Integer.parseInt(br.readLine());

        while (money > 0) {
            for (int i : change) {
                cnt += money / i;
                money %= i;
            }
        }
        sb.append(cnt);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}