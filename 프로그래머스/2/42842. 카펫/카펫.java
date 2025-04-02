class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        
        for (int col = 3; col < sum; col++) { // 세로 = 무조건 3 이상
            int row = sum / col;
            
            if (row >= col) {
                if ((row - 2) * (col - 2) == yellow) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[0];
    }
}