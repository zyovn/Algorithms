import java.util.*;

class Solution {
    static int result;
    public int solution(int []A, int []B) {
        Arrays.sort(A);
        Arrays.sort(B);
        
        for (int i = 0; i < A.length; i++) {
            result += A[i] * B[B.length - 1 - i];
        }
        return result;
    }
}