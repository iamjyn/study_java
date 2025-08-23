package com.study._34_Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이메일을 입력하세요 > ");
        String email = scanner.nextLine();

        /*
        1. 커스텀 예외를 정의해 주세요.
        InvalidEmailException 예외 - 언체크예외
        2. 검증해 주세요.
            1) null 검사
            2) "@" 있는지 검사
        3. finally 까지 작성해주세요.
        */

        try {
            // null 검사
            if (email == null) {
                throw new InvalidEmailException("이메일이 null 입니다.");
            }

            // "@" 검사
            if (!email.contains("@")) {
                throw new InvalidEmailException("이메일은 @가 포함되어야 합니다.");
            }

            System.out.println("유효한 이메일입니다.");

        } catch (InvalidEmailException e) {
            // 오류로깅 -> database에 기록 남김
            // 사용자들에게 오류메시지를 전달(서버 응답)
            System.out.println("오류: " + e.getMessage());
        } finally {
            System.out.println("스캐너 반납");
            scanner.close();
        }

    }
}
