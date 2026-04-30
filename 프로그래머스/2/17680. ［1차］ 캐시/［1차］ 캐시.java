import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        
        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();
            
            if (cacheSize == 0) return answer += cities.length * 5;
            
            if (queue.contains(city)) {
                queue.remove(city);
                queue.add(city);
                answer++;
            } else {
                if (queue.size() == cacheSize) {
                    queue.remove();
                    queue.add(city);
                } else {
                    queue.add(city);
                }
                answer += 5;
            }
        }
        return answer;
    }
}