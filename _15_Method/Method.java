package com.study._15_Method;

public class Method {
    /*
    변수 -> 데이터를 저장 / 재사용
    메서드(함수) -> 코드를 저장 / 재사용
    
    1. 코드 중복 제거 가능
    2. 유지보수가 편하다(메서드만 관리해주면 되니까)
    3. 메서드는 작명이 가능 -> 코드 동작의 의미부여 가능: 가독성이 좋아진다.
    
    자바에서는 메서드가 단독으로 존재할 수 없다.
    -> 반드시 클래스 내부에서 존재할 수 있다.
    
    자주 헷갈리는 것) 함수 정의 / 함수 호출을 구분하자.
    */
    
    // [접근제한자] [static 유무] [리턴 타입] [함수이름]() {}
    
    public static void greeting() {
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
    } // 메서드(함수) 정의

    // [..] [..] [리턴 타입] [함수이름](매개변수타입 매개변수1, 매개변수타입 매개변수2, ...) {}
    // 매개변수 혹은 파라미터(parameter)라고 부름
    // 매개변수를 통해 메서드 내부로 값(stack에 저장된 값) 전달이 가능하다.

    public static void greeting2(String name) {
        System.out.println("안녕하세요 " + name + "님");
    } // 메서드(함수) 정의

    public static void printAddNumber(int num1, int num2) {
        System.out.println("두 수의 합: " + (num1 + num2));
    }

    public static void main(String[] args) {
        System.out.println("함수 호출 전");
        greeting(); // 메서드(함수) 호출
        System.out.println("함수 호출 후");

        String myName = "홍길동";
        greeting2(myName);

        printAddNumber(10, 20);
    }
}
