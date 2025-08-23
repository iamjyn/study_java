package com.study._34_Exception;

public class CheckedMain {

    // 체크예외를 던지는 메서드
    // throws를 사용하면 예외처리(try-catch)를 미룰 수 있다.
    static void checkAge(int age) throws MyCheckedException {
        if (age < 18) {
            throw new MyCheckedException("나이가 18세 미만입니다: " + age);
        }
    }

    public static void main(String[] args) {
        // 정상값이라도 try-catch가 강제
        // 참고) 보통 예외만 잡는 클래스를 정의해서 사용한다.(예외 핸들러)
        try {
            checkAge(30);
        } catch (MyCheckedException e) {
            System.out.println("예외처리: " + e.getMessage());
        }
        /*
        자주 나오는 체크 예외
        IOException: 파일, 네트워크에서 입출력 실패
        FileNotFoundException: 존재하지 않는 파일 찾을 때
        SQLException: 데이터베이스 작업 실패
        */

    }
}
