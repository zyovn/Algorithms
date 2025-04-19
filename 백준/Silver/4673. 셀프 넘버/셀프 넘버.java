import java.io.*;

public class Main {
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        check = new boolean[10001];

        // 셀프 넘버 X
        for (int i = 1; i < 10001; i++) {
            int tmp = d(i);
            if (tmp < 10001) check[tmp] = true;
        }
        // 셀프 넘버
        for (int i = 1; i < 10001; i++) {
            if (!check[i]) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
    private static int d(int num) {
        int sum = num;

        while (num !=0) {
            sum = sum + (num % 10);
            num /= 10;
        }
        return sum;
    }
}