import java.io.*;

public class Main {
    static String word;
    static char result;
    static int[] alphabet;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        word = br.readLine().toUpperCase();
        alphabet = new int[26];

        for (int i = 0; i < word.length(); i++) {
            alphabet[word.charAt(i) - 'A']++;
        }

        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] > cnt) {
                cnt = alphabet[i];
                result = (char) (i + 'A');
            } else if (alphabet[i] == cnt) result = '?';
        }
        sb.append(result);

        br.close();
        bw.write(sb.toString());;
        bw.flush();
        bw.close();
    }
}