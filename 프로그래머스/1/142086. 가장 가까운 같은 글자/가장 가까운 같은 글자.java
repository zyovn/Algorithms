import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int prev = map.getOrDefault(ch, -1);
            
            if (prev == -1) answer[i] = -1;
            else answer[i] = i - prev;
            
            map.put(ch, i);
        }
        return answer;
    }
}