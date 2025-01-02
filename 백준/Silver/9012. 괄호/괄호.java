import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static int T; // 입력 데이터의 수
    static String test; // 테스트 데이터
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack<>();
            test = br.readLine();
            boolean check = true;

            for (int j = 0; j < test.length(); j++) {
                if (test.charAt(j) == '(') {
                    stack.push(test.charAt(j));
                } else if (stack.isEmpty()) {
                    check = false;
                    break;
                } else {
                    stack.pop();
                }
            }

            if (check && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}