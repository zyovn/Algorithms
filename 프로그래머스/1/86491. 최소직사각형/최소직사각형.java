class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < sizes.length; i++) {
            int longLen = Math.max(sizes[i][0], sizes[i][1]);
            int shortLen = Math.min(sizes[i][0], sizes[i][1]);
            
            max = Math.max(max, longLen);
            min = Math.max(min, shortLen);
        }
        return max * min;
    }
}