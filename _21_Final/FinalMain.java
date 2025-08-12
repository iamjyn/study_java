package com.study._21_Final;

public class FinalMain {
    public static void main(String[] args) {
        // final 키워드: 반드시 "한번"만 "초기화" 되어야 함!
        // 1. 변경 불가능
        // 2. 반드시 초기화 해야함

        // final + 자료형
        final int data1; // 선언
        // System.out.println(data1); // 초기화 안하면 컴파일러 에러
        data1 = 10; // 초기화 (최초)
        // data1 = 20; // 2번째 불가능

        FinalStudent st1 = new FinalStudent("김자바", 2025001, 20);
        st1.setAge(21); // 가능
        final FinalStudent st2 = new FinalStudent("이자바", 2025002, 20);
        st2.setAge(21); // 가능
        // st2 = new FinalStudent("박자바", 2025003, 20); // 불가능

        // 결론 : final 키워드는 stack에 있는 값이 변경되지 않도록 막아주는 것.
        // stack의 값(원시자료형 값 -> 실제값 / 참조자료형: 참조주소)을 변경하지 못하게 막는 것

    }
}
