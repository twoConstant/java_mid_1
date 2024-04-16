package 시간정의;

import java.time.LocalTime;

public class LocalTime_edu {

    public static void main(String[] args) {
        // .of() vs .now()
        LocalTime ofTime = LocalTime.of(15, 2, 30);    // 15:02:30
        LocalTime nowTime = LocalTime.now();    // 현재 시각 HH:MM:SS
        System.out.println("ofTime = " + ofTime);
        System.out.println("nowTime = " + nowTime);

        // plus 시, 분, 초
        LocalTime plusHourTime = nowTime.plusHours(1);
        LocalTime plusMinTime = nowTime.plusMinutes(1);
        LocalTime plusSecTime = nowTime.plusSeconds(1);
        System.out.println("plusHourTime = " + plusHourTime);
        System.out.println("plusMinTime = " + plusMinTime);
        System.out.println("plusSecTime = " + plusSecTime);

    }

}
