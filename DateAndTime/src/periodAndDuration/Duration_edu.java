package periodAndDuration;

import java.time.Duration;
import java.time.LocalTime;

public class Duration_edu {

    public static void main(String[] args) {
        // .of() 일, 시, 분, 초
        Duration durationOneDay = Duration.ofDays(1);    //PT24H
        Duration durationOndHr = Duration.ofHours(1);    //PT1H
        Duration durationOnelMin = Duration.ofMinutes(1);    //PT1M
        Duration durationOneSec = Duration.ofSeconds(1);    //PT1S
        System.out.println("durationOneDay = " + durationOneDay);
        System.out.println("durationOndHr = " + durationOndHr);
        System.out.println("durationOnelMin = " + durationOnelMin);
        System.out.println("durationOneSec = " + durationOneSec);

        // plus : 1일 1시간 1분 1초짜리 Duration 만들기
        Duration durationCustom = Duration.ofHours(1).plusMinutes(1).plusSeconds(1);    //PT25H1M1S
        System.out.println("durationCustom = " + durationCustom);

        //계산에 사용
        LocalTime lt = LocalTime.now();
        LocalTime ltPlusDuration = lt.plus(durationCustom);
        System.out.println("ltPlusDuration = " + ltPlusDuration);

        // 시차 계산에 사용
        Duration between = Duration.between(lt, ltPlusDuration);
        System.out.println("durationCustom = " + durationCustom);
        // 총 시간 차이를 환산할때 toxxxx()
        System.out.println("총 시간을 특정 단위로 환산 : toxxx()");
        long hours = between.toHours();
        long minutes = between.toMinutes();
        long seconds = between.toSeconds();
        System.out.println("hours = " + hours);
        System.out.println("minutes = " + minutes);
        System.out.println("seconds = " + seconds);

        // 각 단위별 시간 차이를 추출할때 toxxxPart()
        System.out.println("각 단위의 시차를 추출 : toxxxPart()");
        int hoursPart = between.toHoursPart();
        int minutesPart = between.toMinutesPart();
        int secondsPart = between.toSecondsPart();
        System.out.printf("시차 : %d시간 %d분 %d초", hoursPart, minutesPart, secondsPart);


    }

}
