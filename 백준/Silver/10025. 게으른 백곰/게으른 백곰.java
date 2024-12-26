import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N; // 얼음 양동이 개수
    static int K; // 닿을 수 있는 양동이의 거리
    static int[] ice; // 얼음 1차원 배열
    static int g; // 각 양동이에 담긴 얼음의 양
    static int x; // 각 얼음 양동이의 위치
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken()) * 2 + 1; // i-K ~ i+K까지

        ice = new int[1000001];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            g = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            ice[x] = g; // 얼음 저장
        }
        int sum = 0; // 현재 얼음의 합
        int max = 0;
        for (int i = 0; i<= 1000000; i++) {
            if (i - K >= 0) {
                sum -= ice[i -K]; // 윈도우의 범위를 벗어난 값 제거
            }
            sum += ice[i]; // 현재 위치의 값 윈도우에 추가
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}