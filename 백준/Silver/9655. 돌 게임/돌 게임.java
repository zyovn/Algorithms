import java.io.*;
import java.util.*;

public class Main {
    static int N;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        if (N % 2 == 0) {
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }
    }
}