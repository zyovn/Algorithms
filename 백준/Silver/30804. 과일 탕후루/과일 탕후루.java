import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int start;
    static int[] S;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        S = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            S[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int end = 0; end < N; end++) {
            // end++ 하면서 현재 숫자 해시 맵에 추가
            // get -> 처음 추가하는 숫자는 null 이므로 에러 발생 -> getOrDefault 사용
            map.put(S[end], map.getOrDefault(S[end], 0) + 1);

            // 종류 2개 초과 -> start 이동시켜 범위 조정
            while (map.size() > 2) {
                map.put(S[start], map.get(S[start]) - 1);

                // 0 되면 삭제
                if (map.get(S[start]) == 0) map.remove(S[start]);

                start++;
            }
            // 최댓값 갱신
            max = Math.max(max, end - start + 1);
        }
        bw.write(max + "");
        bw.flush();
        bw.close();
    }
}