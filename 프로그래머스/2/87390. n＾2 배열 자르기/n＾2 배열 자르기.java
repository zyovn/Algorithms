class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left + 1)];
        
        for (int i = 0; i < answer.length; i++) {
            long index = left + i;
            
            int row = (int) (index / n);
            int col = (int) (index % n);
            
            answer[i] = Math.max(row, col) + 1;
        }
        return answer;
    }
}