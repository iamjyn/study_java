package com.study._33_Enum;

public enum Grade {
    BASIC(10), // [public static final Grade] BASIC = [new Grade] (10); [대괄호가 생략됨, 소괄호 안에 내용 없으면 생략 가능]
    GOLD(20), // [public static final Grade] GOLD = [new Grade] (20);
    DIAMOND(30); // [public static final Grade] DIAMOND = [new Grade] (30);

    private int discountRate;

    Grade(int discountRate) {
        this.discountRate = discountRate;
    }

    /*
    enum은 class이다!
    1. Enum이라는 class를 상속받은 클래스
    -> Enum에서 미리 만들어 놓은 메서드를 사용 가능
    2. 생성자만 선언해주면 된다.
    3. 컴파일러가 알아서 컴파일 시점에 코드를 변환해 준다.
    */

    public int discount(int price) {
        return price * this.discountRate / 100;
    }
}
