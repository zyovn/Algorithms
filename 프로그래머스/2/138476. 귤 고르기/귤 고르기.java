import java.util.*;

class Solution {
    static HashMap<Integer, Integer> map = new HashMap<>();
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int sum = 0;
        
        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Comparator.reverseOrder());
        
        for (int cnt : list) {
            sum += cnt;
            answer++;
            if (sum >= k) break;
        }
        return answer;
    }
}