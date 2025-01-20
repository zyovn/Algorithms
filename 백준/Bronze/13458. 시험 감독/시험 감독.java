import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, B, C;
    static long answer;
    static int[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            // 총 감독관 배치
            A[i] -= B;
            answer++;

            //부 감독관 배치
            if (A[i] > 0) {
                answer += A[i] / C;
                if (A[i] % C != 0) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}