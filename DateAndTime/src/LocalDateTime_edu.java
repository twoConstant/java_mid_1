import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTime_edu {

    public static void main(String[] args) {
        // of() vs now()
        LocalDateTime ofDateTime = LocalDateTime.of(2018, 6, 18, 15, 22, 30);
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("ofDateTime = " + ofDateTime);
        System.out.println("ofDateTime = " + ofDateTime);

        // separate LocalDate and LocalTime from LocalDateTime
        LocalDate localdate = nowDateTime.toLocalDate();
        LocalTime localtime = nowDateTime.toLocalTime();
        System.out.println("localdate = " + localdate);
        System.out.println("localtime = " + localtime);

        // merge LocalDate and LocalTime into LocalDateTime
        LocalDateTime mergedLocalDateTime = LocalDateTime.of(localdate, localtime);
        System.out.println("mergedLocalDateTime = " + mergedLocalDateTime);

        // plus
        LocalDateTime plusYearDateTime = nowDateTime.plusYears(1);
        System.out.println("plusYearDateTime = " + plusYearDateTime);

        // Compare
        boolean isAfter = plusYearDateTime.isAfter(nowDateTime);
        boolean isBefore = plusYearDateTime.isBefore(nowDateTime);
        boolean isEqual = nowDateTime.isEqual(mergedLocalDateTime);
        System.out.println("isBefore = " + isBefore);
        System.out.println("isAfter = " + isAfter);
        System.out.println("isEqual = " + isEqual);
    }
}
