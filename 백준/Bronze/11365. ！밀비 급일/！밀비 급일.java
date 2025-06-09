import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String password = br.readLine();
            if (password.equals("END")) break;

            String reverse = new StringBuilder(password).reverse().toString();
            bw.write(reverse + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}