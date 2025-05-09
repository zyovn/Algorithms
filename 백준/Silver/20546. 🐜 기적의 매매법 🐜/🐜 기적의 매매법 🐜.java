import java.io.*;
import java.util.*;

public class Main {
    static int money;
    static int[] price;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        money = Integer.parseInt(br.readLine());
        price = new int[14];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 14; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }
        int jResult = bnp();
        int sResult = timing();

        if (jResult > sResult) sb.append("BNP");
        else if (jResult < sResult) sb.append("TIMING");
        else sb.append("SAMESAME");

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    private static int bnp() {
        int jMoney = money;
        int jStock = 0;
        for (int i = 0; i < 14; i++) {
            if (price[i] <= jMoney) {
                int buy = jMoney / price[i];
                jStock += buy;
                jMoney -= buy * price[i];
            }
        }
        return jMoney + (jStock * price[13]);
    }
    private static int timing() {
        int sMoney = money;
        int sStock = 0;
        for (int i = 3; i < 14; i++) {
            if (price[i - 3] > price[i - 2] && price[i - 2] > price[i - 1]) { // 하락
                int buy = sMoney / price[i];
                sStock += buy;
                sMoney -= buy * price[i];
            } else if (price[i - 3] < price[i - 2] && price[i - 2] < price[i - 1]) { // 상승
                sMoney += sStock * price[i];
                sStock = 0;
            }
        }
        return sMoney + (sStock * price[13]);
    }
}