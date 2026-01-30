class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch >= 'A' && ch <= 'Z') ch = (char) ('A' + (ch - 'A' + n) % 26);
            else if (ch >= 'a' && ch <= 'z') ch = (char) ('a' + (ch - 'a' + n) % 26);
                
            answer += ch;
        }
        return answer;
    }
}