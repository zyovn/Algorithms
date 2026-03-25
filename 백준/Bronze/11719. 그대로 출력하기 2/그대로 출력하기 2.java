import java.io.*;

public class Main {
    static String str;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
    }
}