package ex.ex3;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN] : ");
        String input = sc.next();

        AuthGrade authGrade = AuthGrade.valueOf(input);
        System.out.println("당신의 등급은 " + authGrade.name() + "입니다.");
        System.out.println("==메뉴 목록==");
        if(authGrade.level > 0){
            System.out.println("- 메인화면");
        }

        if(authGrade.level > 1){
            System.out.println("- 이메일 관리 화면");
        }

        if(authGrade.level > 2){
            System.out.println("- 관리자 화면");
        }
    }
}
