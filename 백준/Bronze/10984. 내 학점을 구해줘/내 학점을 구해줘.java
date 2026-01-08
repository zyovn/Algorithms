import java.io.*;
import java.util.*;

public class Main {
    static int T, N, C;
    static double G;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            int grade = 0;
            double gpa = 0;

            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                C = Integer.parseInt(st.nextToken());
                G = Double.parseDouble(st.nextToken());

                grade += C;
                gpa += C * G;
            }
            sb.append(grade).append(" ").append(String.format("%.1f", gpa / grade)).append("\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}