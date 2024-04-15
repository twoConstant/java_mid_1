package ex;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 서울의 회의 사간이 2025년 1월 1일 오전 9시일때
 * 대응하는 런던과 뉴욕의 회의시간을 구해라
 */
public class Ex5 {

    public static void main(String[] args) {
        /**
         * 서울의 회의 시간을 UTC 시각으로 변환
         * UTC 시각을 런던과 뉴욕 시각으로 변환
         */
        ZonedDateTime seoul = ZonedDateTime.of(2024, 1, 1, 9, 0, 0,0, ZoneId.of("Asia/Seoul"));
        System.out.println("seoul = " + seoul);
        Instant utc = Instant.from(seoul);
//        System.out.println("utc = " + utc);
        // 런던 시각으로 변경?
        ZonedDateTime london = ZonedDateTime.ofInstant(utc, ZoneId.of("Europe/London"));
        ZonedDateTime newyork = ZonedDateTime.ofInstant(utc, ZoneId.of("America/New_York"));
        System.out.println("london = " + london);
        System.out.println("newyork = " + newyork);
    }
}
