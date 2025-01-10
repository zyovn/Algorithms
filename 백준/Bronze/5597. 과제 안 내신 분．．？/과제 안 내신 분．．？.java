import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n;
    static boolean[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new boolean[31];

        for (int i = 0; i < 28; i++) {
            n = Integer.parseInt(br.readLine());
            arr[n - 1] = true;
        }
        for (int i = 0; i < 30; i++) {
            if (!arr[i]) {
                System.out.println(i + 1);
            }
        }
    }
}