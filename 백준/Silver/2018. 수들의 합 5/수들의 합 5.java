import java.io.*;

public class Main {
    static int N;
    static int start, end, sum, result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        start = 1;
        end = 1;
        sum = 1;
        result = 0;

        while (start <= N) {
            if (sum == N) {
                result++;
                sum -= start;
                start++;
            } else if (sum > N) {
                sum -= start;
                start++;
            } else {
                end++;
                sum += end;
            }
        }
        sb.append(result);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}