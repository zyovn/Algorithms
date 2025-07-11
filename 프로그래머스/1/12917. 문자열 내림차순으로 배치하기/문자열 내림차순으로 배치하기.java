import java.util.*;

class Solution {
    public String solution(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        
        StringBuilder sb = new StringBuilder(new String(ch));
        
        return sb.reverse().toString();
    }
}