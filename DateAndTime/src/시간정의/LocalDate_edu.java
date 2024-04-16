package 시간정의;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDate_edu {

    public static void main(String[] args) {
        // .of() vs .now
        LocalDate ofDate = LocalDate.of(2018, 7, 3);    // 2018-07-03
        LocalDate nowDate = LocalDate.now();    // 객체가 생성된 오늘 날짜
        System.out.println("ofDate = " + ofDate);
        System.out.println("nowDate = " + nowDate);


        // 년, 월, 일 더하기
        LocalDate plusYearDate = nowDate.plusYears(1);
        LocalDate plusMonthDate = nowDate.plusMonths(1);
        LocalDate plusDateDate = nowDate.plusDays(1);
        System.out.println("plusYearDate = " + plusYearDate);
        System.out.println("plusMonthDate = " + plusMonthDate);
        System.out.println("plusDateDate = " + plusDateDate);

    }
}
