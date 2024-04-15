package ex;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 시작날짜와 목표 날짜를 입력해서 남은 기간과 디데이를 구해라
 * 남은 기간 : x년 x개월 x일 형식으로 출력한다.
 * 디데이 : x일 남은 형식으로 출력한다.
 */
public class Ex3 {

    public static void main(String[] args) {
        /**
         * LocalDate 타입의 시작 날짜와 종료 날짜를 입력받는다.
         * Period의 between()을 활용해 시차를 계산한다.
         */
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        Period between = Period.between(startDate, endDate);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.printf("남은기간 : %d년 %d개월 %d일\n",
            between.getYears(),
            between.getMonths(),
            between.getDays());


        System.out.println("디데이 : " + daysBetween);
    }

}
