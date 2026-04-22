class Solution {
    public int solution(int n) {
        String str = Integer.toString(n, 3);
        String reversedStr = new StringBuilder(str).reverse().toString();
        
        return Integer.parseInt(reversedStr, 3);
    }
}