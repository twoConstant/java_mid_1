package 크로노;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

// 특정 필드 추출
public class ChronoField_edu {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int getYear = now.get(ChronoField.YEAR_OF_ERA);
        int getMonth = now.get(ChronoField.MONTH_OF_YEAR);
        int getDay = now.get(ChronoField.DAY_OF_MONTH);
        int getHour = now.get(ChronoField.HOUR_OF_DAY);
        int getMin = now.get(ChronoField.MINUTE_OF_HOUR);
        int getSec = now.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println("now = " + now);
        System.out.println("getYear = " + getYear);
        System.out.println("getMonth = " + getMonth);
        System.out.println("getDay = " + getDay);
        System.out.println("getHour = " + getHour);
        System.out.println("getMin = " + getMin);
        System.out.println("getSec = " + getSec);
    }
}
