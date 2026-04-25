import java.io.*;
import java.util.*;

public class Main {
    static int N, M, num;
    static String team, member;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        HashMap<String, String> reverseMap = new HashMap<>();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            team = br.readLine();
            num = Integer.parseInt(br.readLine());

            map.put(team, new ArrayList<>());

            for (int j = 0; j < num; j++) {
                member = br.readLine();
                map.get(team).add(member);
                reverseMap.put(member, team);
            }
        }

        for (int i = 0; i < M; i++) {
            String qName = br.readLine();
            int qType = Integer.parseInt(br.readLine());

            if (qType == 0) {
                Collections.sort(map.get(qName));

                for (String name : map.get(qName)) {
                    sb.append(name).append("\n");
                }
            } else if (qType == 1) {
                sb.append(reverseMap.get(qName)).append("\n");
            }
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}