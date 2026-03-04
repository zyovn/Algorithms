class Solution {
    static int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] dayOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
    public String solution(int a, int b) {
        int totalDays = 0;
        
        for (int i = 0; i < a - 1; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += b - 1;
    
        return dayOfWeek[totalDays % 7];
    }
}