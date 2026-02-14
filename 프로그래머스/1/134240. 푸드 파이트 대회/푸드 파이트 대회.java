class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            int cnt = food[i] / 2;
            for (int j = 0; j < cnt; j++) {
                if (cnt >= 1) sb.append(i);
            }
        }
        StringBuilder sbRe = new StringBuilder(sb).reverse();
        sb.append("0").append(sbRe);
        
        return sb.toString();
    }
}