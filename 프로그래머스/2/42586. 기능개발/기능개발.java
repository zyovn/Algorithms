import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            int days = (remain + speeds[i] - 1) / speeds[i];
            queue.add(days);
        }
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            int cnt = 1;
            
            while (!queue.isEmpty() && queue.peek() <= current) {
                queue.poll();
                cnt++;
            }
            list.add(cnt);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}