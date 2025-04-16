import java.util.*;

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s, " ", true);
        StringBuilder sb = new StringBuilder();
        
        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            
            // 공백일 경우
            if (str.equals(" ")) sb.append(str);
            else {
                sb.append(Character.toUpperCase(str.charAt(0))); // 첫 글자
                if (str.length() > 1) sb.append(str.substring(1).toLowerCase()); // 나머지 글자
            }
        }
        return sb.toString();
    }
}