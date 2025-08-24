package com.study._37_Lambda;

public class LambdaMain {
    public static void main(String[] args) {
        /*
        자바 8부터 도입
        - 메서드를 객체처럼 다루고 싶다. (FP 관점)
        FP를 지원하려면, 가능해야 하는 기능
        1. 메서드를 값처럼 변수에 할당
        2. 메서드를 값처럼 매개변수에 할당하여 콜백이 지원되어야 한다.
        void fx(int a, Calculator b) {
            b.calc(a);
        }

        - 하지만, 자바는 메서드만 따로 존재할 수 없음
        - 메서드를 클래스로 바꾸면 되지 않을까?
        - 그럼 메서드 하나만 가지는 클래스를 만들면 되겠다~

        // 메서드를 값처럼 변수에 할당 -> 익명클래스의 객체를 쓰자
        */

        Calculator add = new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        };

        Calculator multi = new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a * b;
            }
        };

        System.out.println(add.calc(10, 5));
        System.out.println(multi.calc(5, 5));

        /*
        (매개변수1, 매개변수2,...) -> {실행부}
        -> : 람다연산
        실행부 : 메서드 구현부
        */

        Calculator lambdaAdd = (int a, int b) -> {
            return a + b;
        };

        // 인터페이스에 메서드가 단독으로 존재하기 때문에
        // 메서드 시그니처가 특정이 가능하다.
        // 시그니처(int 같은 매개변수의 자료형) 생략가능하다.
        // + 한줄로 리턴까지 선언가능하며, 중괄호 + return 생략가능하다.
        Calculator lambdaAdd2 = (a, b) -> a + b;
        lambdaAdd2.calc(1,2);

    }
}
