import java.io.*;
import java.util.Arrays;

public class Main {
    static int sum;
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
                    dwarf[i] = 0;
                    dwarf[j] = 0;
                    
                    Arrays.sort(dwarf);

                    for (int k = 2; k < 9; k++) {
                        sb.append(dwarf[k]).append("\n");
                    }
                    br.close();
                    bw.write(sb.toString());
                    bw.flush();
                    bw.close();
                    
                    return;
                }
            }
        }
    }
}