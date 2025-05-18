import java.io.*;
import java.util.*;

public class Main {
    static double totalScore, totalCredit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        totalScore = 0.0;
        totalCredit = 0.0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (!grade.equals("P")) calculateGrade(credit, grade);
        }
        double result = totalScore / totalCredit;

        br.close();
        bw.write(String.format("%.6f", result));
        bw.flush();
        bw.close();
    }
    private static void calculateGrade(double credit, String grade) {
        switch (grade) {
            case "A+":
                totalScore += credit * 4.5;
                break;
            case "A0":
                totalScore += credit * 4.0;
                break;
            case "B+":
                totalScore += credit * 3.5;
                break;
            case "B0":
                totalScore += credit * 3.0;
                break;
            case "C+":
                totalScore += credit * 2.5;
                break;
            case "C0":
                totalScore += credit * 2.0;
                break;
            case "D+":
                totalScore += credit * 1.5;
                break;
            case "D0":
                totalScore += credit;
                break;
            case "F":
                totalScore += credit * 0.0;
                break;
        }
        totalCredit += credit;
    }
}