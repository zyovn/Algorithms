import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static String[] word;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        word = new String[N];

        for (int i = 0; i < N; i++) {
            word[i] = br.readLine();
        }

        Arrays.sort(word, (o1, o2) -> (
                o1.length() == o2.length()) ? o1.compareTo(o2) : o1.length() - o2.length()
        );

        sb.append(word[0]).append("\n");
        for (int i = 1; i < N; i++) {
            if (!word[i].equals(word[i - 1])) sb.append(word[i]).append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}