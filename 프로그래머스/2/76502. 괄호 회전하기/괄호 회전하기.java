import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Deque<Character> deque = new LinkedList<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            deque.addLast(ch);
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (isValid(deque)) answer++;
            char roChar = deque.remove();
            deque.addLast(roChar);
        }
        return answer;
    }
    
    private boolean isValid(Deque<Character> deque) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : deque) {
            if (ch == '(' || ch == '{' || ch == '[') stack.push(ch);
            else {
                if (stack.isEmpty()) return false;
                else {
                    char chPop = stack.pop();
                    
                    if (ch == ')' && chPop != '(') return false;
                    else if (ch == '}' && chPop != '{') return false;
                    else if (ch == ']' && chPop != '[') return false;
                }
            }
        }
        return stack.isEmpty();
    }
}