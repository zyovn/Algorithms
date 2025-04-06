import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int num : arr) {
            if (stack.isEmpty() || !stack.peek().equals(num)) {
                stack.push(num);
            }
        }
        int[] result = new int[stack.size()];
        
        for (int i = stack.size() - 1; i >= 0 ; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}