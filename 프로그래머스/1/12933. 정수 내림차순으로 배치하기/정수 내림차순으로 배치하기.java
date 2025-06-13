import java.util.*;

class Solution {
    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
        
        String[] answer = String.valueOf(n).split("");
        Arrays.sort(answer);
        
        for (int i = 0; i < answer.length; i++) {
            sb.append(answer[i]);
        }
        
        return Long.parseLong(sb.reverse().toString());
    }
}