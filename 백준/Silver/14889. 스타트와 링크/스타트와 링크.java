import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] ability;
    static boolean[] isStartTeam;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        ability = new int[N + 1][N + 1];
        isStartTeam = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                ability[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        backTracking(0, 1);

        sb.append(min);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void backTracking(int depth, int start) {
        if (depth == N / 2) {
            calculateAbility();
            return;
        }

        for (int i = start; i <= N; i++) {
            isStartTeam[i] = true;
            backTracking(depth + 1, i + 1);
            isStartTeam[i] = false;
        }
    }

    private static void calculateAbility() {
        int start = 0;
        int link = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (isStartTeam[i] && isStartTeam[j]) start += ability[i][j];
                else if (!isStartTeam[i] && !isStartTeam[j]) link += ability[i][j];
            }
        }
        min = Math.min(min, Math.abs(start - link));
    }
}