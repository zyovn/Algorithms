import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int[] prefix = new int[elements.length * 2 + 1];
        
        for (int i = 1; i <= elements.length * 2; i++) {
            prefix[i] = prefix[i - 1] + elements[i % elements.length];
        }
        
        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                set.add(prefix[i + j] - prefix[j]);
            }
        }
        return set.size();
    }
}