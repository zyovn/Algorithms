import java.io.*;
import java.util.*;

public class Main {
    static int M;
    static String cmd;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        M = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cmd = st.nextToken();

            switch (cmd) {
                case "add":
                    set.add(Integer.parseInt(st.nextToken()));
                    break;

                case "remove":
                    set.remove(Integer.parseInt(st.nextToken()));
                    break;

                case "check":
                    if (set.contains(Integer.parseInt(st.nextToken()))) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;

                case "toggle":
                    int input = Integer.parseInt(st.nextToken());
                    if (set.contains(input)) set.remove(input);
                    else set.add(input);
                    break;

                case "all" :
                    set.clear();
                    for (int j = 1; j <= 20; j++) {
                        set.add(j);
                    }
                    break;

                case "empty":
                    set.clear();
                    break;
            }
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}