import java.io.*;
import java.util.*;

public class Main {
    static String S;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        S = br.readLine();
        Stack<Character> stack = new Stack<>();

        boolean isTag = false;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == '<') {
                isTag = true;
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(ch);
            } else if (ch == '>') {
                isTag = false;
                sb.append(ch);
            } else if (isTag) {
                sb.append(ch);
            } else {
                if (ch == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(ch);
                } else stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}