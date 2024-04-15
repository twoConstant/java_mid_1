package ex;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

/**
 * 2024년 1월 1일 부터 2주 간격으로 5번 반복하여 날짜를 출력하는 코드를 작성하세요.
 */
public class Ex2 {

    public static void main(String[] args) {
        /**
         * 2주 간격의 Period 객체를 만들어 해결
         */
        LocalDate curLd = LocalDate.of(2024, 1, 1);
        LocalDate futureLd;
        Period twoWeek = Period.ofDays(14);

        for(int i = 0; i < 5; i++) {
            System.out.println(curLd);
            futureLd = curLd.plus(twoWeek);
            curLd = futureLd;
        }
    }
}
