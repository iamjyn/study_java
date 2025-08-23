package com.study._33_Enum;

public class ClassGrade {
    /*
    매직넘버, 매직스트링 -> 상수(static final)로 해결했었음.
    1. 컴파일 시점에서는 타입 검증이 불가능하다. 런타임에 하필 문제가 발생
    -> 상수도 결국 값의 타입이 String, int..
    -> 매개변수로 상수가 아닌 다른 값을 전달하게 코드를 작성해도
    -> 컴파일러는 그걸 에러라고 생각하지 않습니다.
    -> 상수가 아니면 컴파일 에러를 발생하게 만들고 싶다!
    2. 그룹화가 어렵다
    3. 네임스페이스가 부족하다(동명이 많다)
    -> STATUS, GRADE 같은 경우 서로 다른 클래스에서 동일하게 많이 차용하게 됨

    => 문자열이나 숫자(타입) 대신에 객체(주소)를 그냥 상수르 쓰면 안될까?
    */

    private int discountPercent;

    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    // 생성자를 private로 막아준다.
    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }





}
