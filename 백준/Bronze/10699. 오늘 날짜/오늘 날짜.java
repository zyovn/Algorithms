import java.time.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(LocalDate.now(ZoneId.of("Asia/Seoul")));
    }
}