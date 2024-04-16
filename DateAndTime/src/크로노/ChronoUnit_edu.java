package 크로노;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

// 단위 환산시 또는 시간의 양을 보관하고있는 클래스
public class ChronoUnit_edu {

    public static void main(String[] args) {
        // .values() ChronoUnit의 열거형 자료 조회하기
        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            System.out.println(value);
        }

        // 년, 월, 일, 시, 분, 초로 환산하기
        // LocalDate는 년, 월, 일까지만 환산 가능하다.
        LocalDate startDate = LocalDate.of(2018, 2, 23);
        LocalDate endDate = LocalDate.of(2020, 5, 13);

        long toYears = ChronoUnit.YEARS.between(startDate, endDate);    //2
        long toMonths = ChronoUnit.MONTHS.between(startDate, endDate);    //26
        long toDays = ChronoUnit.DAYS.between(startDate, endDate);    //810

        System.out.println("toYears = " + toYears);
        System.out.println("toMonths = " + toMonths);
        System.out.println("toDays = " + toDays);

        // LocalTime은 시, 분, 초로 환산이 가능하다.
        LocalTime startTime = LocalTime.of(8, 29, 44);
        LocalTime endTime = LocalTime.of(14, 12, 52);

        long toHours = ChronoUnit.HOURS.between(startTime, endTime);    //5
        long toMinutes = ChronoUnit.MINUTES.between(startTime, endTime);    //343
        long toSeconds = ChronoUnit.SECONDS.between(startTime, endTime);    //20588

        LocalDateTime startLocalDateTime = LocalDateTime.of(2018, 12, 1, 13, 1, 1);
        LocalDateTime endLocalDateTime = LocalDateTime.of(2020, 12, 1, 13, 1, 1);

        System.out.println("toHours = " + toHours);
        System.out.println("toMinutes = " + toMinutes);
        System.out.println("toSeconds = " + toSeconds);

        // LocalDateTime은 년, 월, 일, 시, 분, 초 환산 다 가능하다.
        long toYears1 = ChronoUnit.YEARS.between(startLocalDateTime, endLocalDateTime);    //2
        long toMonths1 = ChronoUnit.MONTHS.between(startLocalDateTime, endLocalDateTime);    //24
        long toDays1 = ChronoUnit.DAYS.between(startLocalDateTime, endLocalDateTime);    //731
        long toHours1 = ChronoUnit.HOURS.between(startLocalDateTime, endLocalDateTime);    //17544
        long toMinutes1 = ChronoUnit.MINUTES.between(startLocalDateTime, endLocalDateTime);    //1052640
        long toSeconds1 = ChronoUnit.SECONDS.between(startLocalDateTime, endLocalDateTime);    //63158400

        System.out.println("toYears1 = " + toYears1);
        System.out.println("toMonths1 = " + toMonths1);
        System.out.println("toDays1 = " + toDays1);
        System.out.println("toHours1 = " + toHours1);
        System.out.println("toMinutes1 = " + toMinutes1);
        System.out.println("toSeconds1 = " + toSeconds1);

    }
}
