import java.util.*;

class Solution {
    static int[] score = {0, 0, 0};
    static int[] first = {1, 2, 3, 4, 5};
    static int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
    static int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    public int[] solution(int[] answers) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % 5]) score[0]++;
            if (answers[i] == second[i % 8]) score[1]++;
            if (answers[i] == third[i % 10]) score[2]++;
        }
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        
        for (int i = 0; i < score.length; i++) {
            if (score[i] == max) list.add(i + 1);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}