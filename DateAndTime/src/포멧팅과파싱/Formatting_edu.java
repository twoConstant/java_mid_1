package 포멧팅과파싱;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formatting_edu {

    public static void main(String[] args) {
        // 포멧팅 자바 객체 => 문자열
        LocalDate date = LocalDate.of(2024, 12, 31);
        // 원하는 포멧 정의
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        // 데이터 포멧
        String formattedDate = date.format(formatter);
        System.out.println("date = " + date);
        System.out.println("formattedDate = " + formattedDate);

        // 파싱 문자열 => 자바 객체
        String input = "2030년 01월 01일";
        LocalDate parsedDate = LocalDate.parse(input, formatter);
        System.out.println("input = " + input);
        System.out.println("parsedDate = " + parsedDate);

    }
}
