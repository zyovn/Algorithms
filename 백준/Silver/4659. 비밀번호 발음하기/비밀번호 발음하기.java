import java.io.*;
import java.util.*;

public class Main {
    static List<Character> vowel = new ArrayList<>(List.of('a', 'e', 'i', 'o', 'u'));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String pwd = br.readLine();

            if (pwd.equals("end")) break;

            if (isAcceptable(pwd)) sb.append("<").append(pwd).append("> is acceptable.").append("\n");
            else sb.append("<").append(pwd).append("> is not acceptable.").append("\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean isAcceptable(String pwd) {
        boolean isVowel = false;
        int vowelCnt = 0;
        int consoCnt = 0;

        for (int i = 0; i < pwd.length(); i++) {
            char ch = pwd.charAt(i);

            // 조건 1 : 모음 포함 여부
            if (vowel.contains(ch)) {
                isVowel = true;
                vowelCnt++;
                consoCnt = 0;
            } else {
                consoCnt++;
                vowelCnt = 0;
            }

            // 조건 2 : 모음 or 자음 3개 이상 연속 확인
            if (vowelCnt >= 3 || consoCnt >= 3) return false;

            // 조건 3 : 같은 글자 연속 여부 (예외 : ee, oo)
            if (i > 0 && pwd.charAt(i - 1) == pwd.charAt(i)) {
                if (pwd.charAt(i) != 'e' && pwd.charAt(i) != 'o') return false;
            }
        }
        return isVowel;
    }
}