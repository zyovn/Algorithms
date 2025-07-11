class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        
        while (!s.equals("1")) {
            String replaceStr = s.replaceAll("0", "");
            answer[1] += s.length() - replaceStr.length();
                    
            s = Integer.toBinaryString(replaceStr.length());
            
            cnt++;
        }
        answer[0] = cnt;

        return answer;
    }
}