package com.study._30_NestedClass;

public class Main {
    public static void main(String[] args) {
        /*
        익명 클래스:
        - 이름이 없는 클래스
        - 클래스 정의와 동시에 인스턴스 생성
        => 한번 쓰고 버릴 객체(재사용 하지 않음)
        - 인터페이스, 추상클래스를 구현할 때
        - 일반 객체처럼 메서드영역, 힙 두 군데 모두 메모리가 정상 로드 됨
        */

        // 변수타입(컴파일러 입장) -> Hello
        // 객체타입(JVM 입장) -> 실제 객체타입이 Hello가 아니다! -> 익명
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("하이");
            }

            @Override
            public void bye() {
                System.out.println("바이");
            }
        };

        Hello hello2 = new Hello() {
            @Override
            public void hello() {

            }

            @Override
            public void bye() {

            }
        };

        // 익명클래스의 이름 확인
        // Main$1 -> 메인에서 만들어진 익명1
        System.out.println(hello.getClass().getName());
        // Main$2 -> 메인에서 만들어진 익명2
        System.out.println(hello2.getClass().getName());

        // -> 람다식(익명클래스의 파생 문법)

    }
}
