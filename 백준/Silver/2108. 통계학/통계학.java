import java.io.*;
import java.util.*;

public class Main {
    static int n, sum, mean, median, mode, range;
    static int[] num;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static HashMap<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(br.readLine());
            sum += num[i];
            map.put(num[i], map.getOrDefault(num[i], 0) + 1);
            max = Math.max(max, num[i]);
            min = Math.min(min, num[i]);
        }
        Arrays.sort(num);

        mean = (int) Math.round((double) sum / n);

        median = num[n / 2];

        int maxValue = 0;
        for (int value : map.values()) {
            maxValue = Math.max(maxValue, value);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) list.add(entry.getKey());
        }
        Collections.sort(list);

        if (list.size() > 1) mode = list.get(1);
        else mode = list.get(0);

        range = max - min;

        sb.append(mean).append("\n").append(median).append("\n").append(mode).append("\n").append(range).append("\n");

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}