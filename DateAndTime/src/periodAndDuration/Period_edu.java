package periodAndDuration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Period_edu {

    public static void main(String[] args) {
        // .of()  년, 월, 일
        Period oneYearPeriod = Period.ofYears(1);    //P1Y
        Period oneMonthPeriod = Period.ofMonths(1);    //P1M
        Period oneDayPeriod = Period.ofDays(1);    //P1D
        System.out.println("oneYearPeriod = " + oneYearPeriod);
        System.out.println("oneMonthPeriod = " + oneMonthPeriod);
        System.out.println("oneDayPeriod = " + oneDayPeriod);
        // plus 연산으로 내가 원하는 시간 양 만들기
        Period customPeriod = Period.ofYears(1).plusDays(1).plusMonths(1);
        System.out.println("customPeriod = " + customPeriod);

        // 현재 날짜 + Period 연산
        LocalDate nowDate = LocalDate.now();    //2024-04-15
        LocalDate nowDatePlusYear = nowDate.plus(oneYearPeriod);    //2025-04-15
        LocalDate nowDatePlusMonth = nowDate.plus(oneMonthPeriod);    //2024-05-15
        LocalDate nowDatePlusDay = nowDate.plus(oneDayPeriod);    //2024-04-16
        System.out.println("nowDate = " + nowDate);
        System.out.println("nowDatePlusYear = " + nowDatePlusYear);
        System.out.println("nowDatePlusMonth = " + nowDatePlusMonth);
        System.out.println("nowDatePlusDay = " + nowDatePlusDay);

        // 기간 차이 계산
        Period between = Period.between(nowDate, nowDatePlusYear);    //P1Y
        System.out.println("between = " + between);    //P1Y
        System.out.println("between = " + between.getYears());    // 1
        System.out.println("between = " + between.getDays());    // 0

        LocalDate startDate = LocalDate.of(2018, 8, 12);
        LocalDate endDate = LocalDate.of(2025, 6, 10);
        Period between1 = Period.between(startDate, endDate);    // P6Y9M29D
        System.out.println("between1 = " + between1);
        System.out.printf("기간 차이 : %d년 %d개월 %d일", between1.getYears(), between1.getMonths(), between1.getDays());

    }
}
