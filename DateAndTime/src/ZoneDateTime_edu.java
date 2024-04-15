import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTime_edu {

    public static void main(String[] args) {
        // of() vs now()
        ZonedDateTime zdt1 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Tokyo"));    //2024-04-15T19:57:22.003761100+09:00[Asia/Tokyo]
        ZonedDateTime nowZdt = ZonedDateTime.now();    // 현재 서버의 시스템에 따라 ZoneId가 자동으로 셋팅된다.    //2024-04-15T19:57:22.004824600+09:00[Asia/Seoul]
        ZonedDateTime utfZdt = nowZdt.withZoneSameInstant(ZoneId.of("UTC"));    //2024-04-15T10:57:22.004824600Z[UTC]
        System.out.println("zdt1 = " + zdt1);
        System.out.println("nowZdt = " + nowZdt);
        System.out.println("utfZdt = " + utfZdt);
    }

}
