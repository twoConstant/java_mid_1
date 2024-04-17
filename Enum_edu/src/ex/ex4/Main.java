package ex.ex4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("HTTP CODE : ");
        int httpCodeInput = sc.nextInt();

        HttpStatus status = HttpStatus.findByCode(httpCodeInput);
        if(status == null) {
            System.out.println("정의되지 않은 코드");
        } else {
            System.out.println(status.getCode() + " " + status.getMessage());
            System.out.println("isSuccess = " + status.isSuccess());
        }
    }

}
