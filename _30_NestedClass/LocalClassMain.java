package com.study._30_NestedClass;

public class LocalClassMain {
    // 지역 클래스 (잘안씀)
    /*
    - 메서드 내에서 정의된 클래스
    - 해당 메서드 내부에서만 객체 생성가능, 호출가능
    - 바깥 클래스의 private 필드에 접근 가능
    */

    public static void printTotal(int a, int b) {
        // 지역 클래스
        class Calculator {
            int add(int x, int y) {return x + y;}
        }

        // 메서드 내부에서만 생성, 사용 가능
        Calculator calc = new Calculator();
        System.out.println("합계: " + calc.add(a, b));
    }

    // 메서드 안에서 메서드를 쓰고 싶다.
    // 자바에서는 메서드가 클래스 없이 단독 존재 불가능
    // 지역클래스를 선언 -> 메서드를 선언하여 사용
    // 더이상 많이 사용되지 x -> 람다(자바8) 출현하여 잘 안쓰이게 됨

}
