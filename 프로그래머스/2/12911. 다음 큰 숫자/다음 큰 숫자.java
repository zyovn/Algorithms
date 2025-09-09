class Solution {
    public int solution(int n) {
        int answer = n + 1;
        int cnt = Integer.bitCount(n);
        
        while (true) {
            int nextCnt = Integer.bitCount(answer);
            
            if (cnt == nextCnt) {
                break;
            }
            answer++;
        }
        return answer;
    }
}