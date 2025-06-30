import java.io.*;
import java.util.*;

public class Main {
    static int T, N, M;
    static int[] notebook;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        while (T --> 0) {
            N = Integer.parseInt(br.readLine());
            notebook = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                notebook[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(notebook);

            M = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                int key = Integer.parseInt(st.nextToken());
                if (binarySearch(key)) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }
        }
        br.close();
        bw.write(sb.toString());;
        bw.flush();
        bw.close();
    }

    private static boolean binarySearch(int key) {
        int low = 0;
        int high = N - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (notebook[mid] == key) return true;
            else if (notebook[mid] > key) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }
}