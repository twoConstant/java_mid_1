package 시간조작;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Plus_edu {

    // plus의 3가지 활용법 minus도 동일하다.
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        // 1시간 추가하기
        // 편의 메서드
        LocalDateTime localDateTime1 = now.plusHours(1);

        // ChronUnite을 활용한 방법
        LocalDateTime localDateTime2 = now.plus(1, ChronoUnit.HOURS);

        // Period or Duration을 활용한 방법
        Duration duration = Duration.ofHours(1);
        Duration duration1 = Duration.of(1, ChronoUnit.HOURS);
        LocalDateTime localDateTime3 = now.plus(duration);

        System.out.println("now = " + now);
        System.out.println("duration = " + duration);
        System.out.println("localDateTime1 = " + localDateTime1);
        System.out.println("localDateTime2 = " + localDateTime2);
        System.out.println("localDateTime3 = " + localDateTime3);

    }
}
