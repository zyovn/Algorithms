import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();
        int len = phone_book.length;
        
        for (int i = 0; i < len; i++) {
            map.put(phone_book[i], map.getOrDefault(phone_book[i], 0) + 1);
        }
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0, j))) return false;
            }
        }
        return true;
    }
}