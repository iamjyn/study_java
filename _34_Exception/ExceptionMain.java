package com.study._34_Exception;

public class ExceptionMain {
    static void method1() {
        System.out.println("method1이 method2 호출");
        method2();
    }

    static void method2() {
        System.out.println("method2에서 만든 예외");
        throw new RuntimeException("method2예외");
    }

    public static void main(String[] args) {
        /*
        - 예외(에러)처리의 목적
        1. 프로그램 비정상 종료 방지
        2. 오류 상황과 정상 상황과 흐름 분리
        3. 오류에 대한 적절한 메시지(로깅)

        - 예외도 결국 객체
        예외 계층
        Throwable (최상위 클래스)
            ㄴ Exception (예외)
                ㄴ Checked Exception
                ㄴ UnChecked Exception(Runtime)

        - 문법 키워드
        예외 발생(생성): throw 예외 클래스 이름
        예외 처리(소멸): catch (예외 클래스이름)
        예외 전파: throws

        --stack-- : 메서드마다 스택 프레임을 만들어 줌
        stack(method2) : 최종 호출
        stack(method1)
        stack(main) : 최초 호출
        main -> method1 -> method2(에러 발생!)

        전파:
        method2 -> method1 -> main 순으로 catch를 찾음
        catch가 없다면, 프로그램 이상 종료 및 콘솔창에 에러가 기록
        */

        try { // 전파된 에러를 잡음(method2 -> method1 -> main)
            method1();
            System.out.println("예외가 발생하면 이 코드는 실행되지 않아요.");
            /*
            예외객체 생성 ->
            1. 코드 진행이 즉각 중단 됨
            2. JVM이 try-catch 코드를 탐색
            3. 호출 스택을 거슬러 따라가면서 try-catch를 탐색
            4. 없다면, JVM이 예외를 출력하고 프로그램을 종료
            */
        } catch (RuntimeException e) { // try 안에서 발생한 예외 객체만 잡는다.
            System.out.println(e.getMessage());
        } finally {
            // 예외 발생 여부와는 상관없이 항상 실행되는 코드블럭
            // 자원 정리코드(파일 닫기, 객체 반납, DB 연결종료..)
            System.out.println("예외처리 여부와 상관없이 실행됩니다!");
        }

    }

}
