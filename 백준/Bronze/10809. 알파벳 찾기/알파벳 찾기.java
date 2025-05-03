import java.io.*;

public class Main {
    static String S;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        S = br.readLine();
        arr = new int[26];

        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            int idx = ch - 'a';

            if (arr[idx] == -1) arr[idx] = i;
        }

        for (int i = 0; i < 26; i++) {
            sb.append(arr[i]).append(" ");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}