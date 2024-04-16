package 시간조작;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

// 시각의 특정 필드를 타겟해서 변경할 수 있다.
public class With_edu {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        // 년도를 25년으로 수정하기
        // with 정석 whit ChronoField
        LocalDateTime localDateTime1 = now.with(ChronoField.YEAR, 2025);

        // with 편의 메서드
        LocalDateTime localDateTime2 = now.withYear(2025);

        // TemporalAdjuster 특정 기준을 통해 변경 할 때
        // now 월의 마지막 일요일 날짜로 변겅
        LocalDateTime localDateTime3 = now.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));

        System.out.println("now = " + now);
        System.out.println("localDateTime1 = " + localDateTime1);
        System.out.println("localDateTime2 = " + localDateTime2);
        System.out.println("localDateTime3 = " + localDateTime3);
    }
}
