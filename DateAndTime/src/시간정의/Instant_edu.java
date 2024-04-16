package 시간정의;

import java.time.Instant;
import java.time.ZonedDateTime;

public class Instant_edu {

    public static void main(String[] args) {
        Instant now = Instant.now();    //2024-04-15T11:08:24.824417600Z

        // ZonedDateTime을 Instant로 치환
        ZonedDateTime zdt = ZonedDateTime.now();    //2024-04-15T20:09:07.326222100+09:00[Asia/Seoul]
        Instant zdtToInstant = Instant.from(zdt);    //2024-04-15T11:09:07.326222100Z
        System.out.println("now = " + now);
        System.out.println("zdt = " + zdt);
        System.out.println("zdtToInstant = " + zdtToInstant);

        // Epoch를 기준으로 Instant 정의하기
        Instant start = Instant.ofEpochSecond(0);    //1970-01-01T00:00:00Z
        Instant startPlus1H = Instant.ofEpochSecond(3600);    //1970-01-01T01:00:00Z
        System.out.println("start = " + start);
        System.out.println("startPlus1H = " + startPlus1H);
    }

}
