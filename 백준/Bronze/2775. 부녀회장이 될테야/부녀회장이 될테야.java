import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int T;
    static int[][] APT = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for (int i = 1; i < 15; i++) {
            APT[i][1] = 1; // 각 층의 1호 = 1명
            APT[0][i] = i; // 0층의 i호 = i명
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) { // 2부터 시작 (1호는 이미 1로 초기화 완료)
                APT[i][j] = APT[i][j-1] + APT[i-1][j];
            }
        }
        int[] results = new int[T]; // 결과 저장 배열
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine()); // 층
            int n = Integer.parseInt(br.readLine()); // 호

            results[i] = APT[k][n];
        }
        for (int result: results) {
            System.out.println(result);
        }
    }
}