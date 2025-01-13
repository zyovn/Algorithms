import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int A, B, C, cnt;
    static String result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());
        
        result = String.valueOf(A * B * C);
        
        for (int i = 0; i < 10; i++) {
            cnt = 0;
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) - '0' == i) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}