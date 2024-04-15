package ex;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

/**
 * 2024년 1월 1일 0시 0분 0초에 1년 2개월 3일 4시간 후의 시각을 찾아라
 */
public class Ex1 {

    public static void main(String[] args) {
        /**
         * LocalDateTime 2024-1-1T00:00:00을 정의한다.
         * Period 1년 2개월 3일 짜리를 정의한다.
         * Duration 4시간 짜리를 정의한다.
         * calculateLocalDateTime 을 계산한다.
         * 시각을 추출한다.
         */
        LocalDateTime ldt =
            LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        Period period = Period.ofYears(1).plusMonths(2).plusDays(3);
        Duration duration = Duration.ofHours(4);

        LocalDateTime calculateLdt = ldt.plus(period).plus(duration);    //2025-03-04T04:00
        System.out.println("기준 시각 : " + ldt);
        System.out.println("1년 2개월 3일 4시간 후의 시각 : " + calculateLdt);

        // 아래의 풀이가 더 직관적이다.
        LocalDateTime localDateTime2 = ldt.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
    }

}
