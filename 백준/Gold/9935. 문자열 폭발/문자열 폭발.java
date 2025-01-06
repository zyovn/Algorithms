import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static String str; // 문자열
    static String bomb; // 폭발 문자열
    static int strLen, bombLen;
    static Stack<Character> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        str = br.readLine();
        bomb = br.readLine();

        strLen = str.length();
        bombLen = bomb.length();

        for (int i = 0; i < strLen; i++) {
            stack.push(str.charAt(i));
            if (stack.size() >= bombLen) { // 스택의 크기가 폭발 문자열의 길이와 같을 경우
                boolean check = true;
                for (int j = 0; j < bombLen; j++) { // 폭발 문자열 길이만큼 비교
                    if (stack.get(stack.size() - bombLen + j) != bomb.charAt(j)) { // 폭발 문자열 시작 인덱스 계산 후, 폭발 문자열의 현재 문자와 비교
                        check = false;
                        break;
                    }
                }
                if (check) { // 폭발 문자열과 일치
                    for (int j = 0; j < bombLen; j++) {
                        stack.pop();
                    }
                }
            }
        }
        for (char ch : stack) {
            sb.append(ch);
        }
        System.out.println(sb.length() > 0 ? sb.toString() : "FRULA");
    }
}