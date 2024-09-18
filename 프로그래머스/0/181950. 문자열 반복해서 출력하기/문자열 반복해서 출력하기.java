import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String space = "";
        
        for (int i = 0; i < n; i++) {
            space += str;
        }
        System.out.println(space);
    }
}