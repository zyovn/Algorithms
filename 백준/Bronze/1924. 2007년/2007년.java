import java.io.*;
import java.util.*;

public class Main {
    static int x, y;
    static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] dayOfWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        int totalDays = 0;

        for (int i = 0; i < x - 1; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += y - 1;

        sb.append(dayOfWeek[totalDays % 7]);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}