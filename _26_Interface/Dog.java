package com.study._26_Interface;

public class Dog implements Animal, Swimmable {
    // 인터페이스는 implements로 이식받는다라고 표현

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지가 뛰어 놉니다.");
    }

    @Override
    public void swim() {
        System.out.println("강아지가 헤엄칩니다.");
    }
}
