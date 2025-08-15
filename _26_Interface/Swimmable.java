package com.study._26_Interface;

public interface Swimmable {
    void swim();
    /*
    객체 지향 설계 5원칙(SOLID)
    4. Interface Segregation Principle - 인터페이스 분리 원칙
    : 구현체는 자신이 사용하지 않는 메서드에 의존하면 안된다.
    Animal에 swim(), fly()를 정의해 버리면,
    swim과 fly가 필요없는 클래스도 강제구현해야 함
    -> 필요한 기능끼리 "적절히" 분리해서 나눈 뒤, 다중상속으로 조합해서 사용하자

    SOLID 원칙을 반드시 지켜야하는가?
    -> 상황마다 트레이드 오프하자.
    */
}
