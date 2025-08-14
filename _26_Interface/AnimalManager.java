package com.study._26_Interface;

public class AnimalManager {
    /*
    인터페이스 타입으로 매개변수를 받는다.
    => 추상체에 의존하고 있다.
    => 결합도가 낮다.
    *결합도: 클래스간의 의존 정도(척도)

    결합도가 높다 -> 구체적인 클래스(구현체)에 의존 -> 유연하지 못하다
    결합도가 낮다 -> 인터페이스/추상클래스(추상체)에 의존 -> 유연하다

    의존:
    1. 필드로 선언된 경우
    2. 정의된 메서드에 파라미터에 선언된 경우

    [구현체] -> [추상체] <- [구현체] : 이상적인 의존상태
    [Dog] -> [Animal, Swimmable] <- [AnimalManager]

    객체 지향 설계 5원칙(SOLID)
    DIP(Dependency Inversion Principle) - 의존성 역전 원칙
    : 추상체는 구체적인 것에 의존하면 안된다.
    구체적인 것이 추상체에 의존해야 한다.

    장점
    - 확장이 쉽다(새로운 동물이 나와도, AnimalManger는 추가코드 x)
    - 변경이 안정적(Dog의 내부 구현이 바뀌어도, AnimalManger는 변경코드 x)
    */

    public void makeSound(Animal animal) {
        // 강제로 sound 메서드 구현이 보장됨(문법 강제)
        // -> 강제로 다형성이 구현
        animal.sound();
    }

    public void testFlying(Flyable flyable) {
        flyable.fly();
    }

    public void testSwimming(Swimmable swimmable) {
        swimmable.swim();
    }

}
