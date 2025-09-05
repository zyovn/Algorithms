class Solution {
    public int solution(int n) {
        int start = 1;
        int end = 1;
        int sum = 1;
        int answer = 0;
        
        while (start <= end) {
            if (sum == n) {
                answer++;
                sum -= start;
                start++;
            } else if (sum > n) {
                sum -= start;
                start++;
            } else {
                end++;
                sum += end;
            }
        }
        return answer;
    }
}