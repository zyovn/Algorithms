import java.util.*;
import java.io.*;

class Solution {
    static int t;
    static int[] num;
	public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());
        num = new int[11];

        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double sum = 0;

            for (int j = 1; j <= 10; j++) {
                num[j] = Integer.parseInt(st.nextToken());
                sum += num[j];
            }
            int avg = (int) Math.round(sum / 10);
            sb.append("#").append(i).append(" ").append(avg).append("\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}