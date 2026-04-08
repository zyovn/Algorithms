import java.io.*;
import java.util.*;

public class Main {
    static String parentheses;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();
        int cnt = 0;

        parentheses = br.readLine();
        for (int i = 0; i < parentheses.length(); i++) {
            char ch = parentheses.charAt(i);

            if (ch == '(') stack.push(ch);
            else {
                stack.pop();

                if (parentheses.charAt(i - 1) == '(') cnt += stack.size();
                else cnt++;
            }
        }
        sb.append(cnt);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
