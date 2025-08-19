import java.io.*;

public class Main {
    static int sum, fake1, fake2;
    static int[] dwarf;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        dwarf = new int[9];

        for (int i = 0; i < 9; i++) {
            dwarf[i] = Integer.parseInt(br.readLine());
            sum += dwarf[i];
        }

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - (dwarf[i] + dwarf[j]) == 100) {
                    fake1 = i;
                    fake2 = j;
                    break;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (i == fake1 || i == fake2) continue;
            sb.append(dwarf[i]).append("\n");
        }

        br.close();
        bw.write(sb.toString());;
        bw.flush();
        bw.close();
    }
}