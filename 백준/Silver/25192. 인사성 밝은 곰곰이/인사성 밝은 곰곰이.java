import java.io.*;
import java.util.*;

public class Main {
    static int N, cnt;
    static String str;
    static HashSet<String> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            str = br.readLine();

            if (str.equals("ENTER")) {
                cnt += set.size();
                set.clear();
            } else set.add(str);
        }
        // 마지막 인원 합산
        cnt += set.size();

        sb.append(cnt);

        br.close();
        bw.write(sb.toString());;
        bw.flush();
        bw.close();
    }
}