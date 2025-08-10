class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                sb.append(' ');
                idx = 0;
            } else {
                if (idx % 2 == 1) {
                    sb.append(Character.toLowerCase(ch));
                } else {
                    sb.append(Character.toUpperCase(ch));
                }
                idx++;
            }
        }
        return sb.toString();
    }
}