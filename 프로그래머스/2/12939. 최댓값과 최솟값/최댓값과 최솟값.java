import java.io.*;
import java.util.*;

class Solution {
    static String[] strArr;
    static int[] numArr;
    public String solution(String s) {
        strArr = s.split(" ");
        numArr = new int[strArr.length];
        
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        Arrays.sort(numArr);
        
        return numArr[0] + " " + numArr[numArr.length - 1];
    }
}