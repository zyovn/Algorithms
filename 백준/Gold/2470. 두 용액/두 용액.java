import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] charValue;
    static int closeZero = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        charValue = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            charValue[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(charValue);

        int left = 0;
        int right = N - 1;
        int charValue1 = 0;
        int charValue2 = 0;

        while (left < right) {
            int sum = charValue[left] + charValue[right];

            if (Math.abs(sum) < closeZero) {
                closeZero = Math.abs(sum);
                charValue1 = charValue[left];
                charValue2 = charValue[right];
            }

            if (sum < 0) left++;
            else if (sum > 0) right--;
            else break;
        }
        sb.append(charValue1).append(" ").append(charValue2);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}