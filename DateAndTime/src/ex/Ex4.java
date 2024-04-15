package ex;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * 2024년 1월의 첫날의 요일과 마지막날 요일을 구하라
 */
public class Ex4 {

    public static void main(String[] args) {
        /**
         * LocalDate 객체를 생성한다.
         * dayOfWeek() => 해당 날짜의 요일을 반환함 를 활용해 첫 요일을 계산한다.
         * with()과 TemporalAdjusters를 활용하여 해당 월의 마지막 일로 간다.
         * dayOfWeek()를 활용해 마지막 날의 요일을 반환받는다.
         */
        LocalDate ld = LocalDate.of(2024, 1, 1);
        DayOfWeek startDayOfWeek = ld.getDayOfWeek();
        // 해당 월의 마지막 날짜로 조작
        LocalDate lastDate = ld.with(TemporalAdjusters.lastDayOfMonth());
        // 해당 월의 마지말 날짜의 요일 반환
        DayOfWeek lastDayOfWeek = lastDate.getDayOfWeek();

        System.out.println("startDayOfWeek = " + startDayOfWeek);
        System.out.println("lastDayOfWeek = " + lastDayOfWeek);
    }
}
