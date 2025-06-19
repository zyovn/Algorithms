import java.io.*;
import java.util.*;

public class Main {
    private static class Members implements Comparable<Members> {
        int age;
        String name;

        Members(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Members o) {
            return this.age - o.age;
        }
    }
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        ArrayList<Members> members = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            members.add(new Members(Integer.parseInt(st.nextToken()), st.nextToken()));
        }
        Collections.sort(members);

        for (int i = 0; i < N; i++) {
            sb.append(members.get(i).age).append(" ").append(members.get(i).name).append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
