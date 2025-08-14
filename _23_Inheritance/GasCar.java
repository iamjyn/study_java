package com.study._23_Inheritance;

public class GasCar extends Car {
    private int fuelLevel;

    public GasCar(String brand) {
        super(brand);
        System.out.println("GasCar 생성자 호출!");
        this.fuelLevel = 100;
    }

    public GasCar() {
        this.fuelLevel = 100;
    }

    // 오버라이딩(overriding) : 부모의 메서드를 재정의하는 것(덮어쓰기)
    /*
    메서드 영역에는 Car에도 move()가 있고, GasCar에도 move()가 별도로 존재
    JVM이 객체가 메서드를 호출하면 자식클래스 먼저 탐색 -> 없으면 부모클래스 탐색
    *JVM은 실제 객체 타입 기준으로 메서드를 호출
    Car car = new GasCar(); 실제 객체 타입? 우변 기준: GasCar를 말함

    규칙:
    1. 메서드 시그니처가 부모의 메서드와 완전히 동일
    2. @Override @(어노테이션) -> 컴파일러가 부모와 동일한 메서드 시그니처인지 검사

    메서드 오버라이딩 vs 메서드 오버로딩
    오버라이딩: 상속관계, 부모의 시그니처와 동일한 함수를 재정의
    오버로딩: 같은 클래스 내에서, 이름만 같고, 시그니처가 다른 함수를 만드는 것
    */

    @Override
    public void move() {
        System.out.println("가솔린차로 이동합니다.");
    }

    @Override
    public void showInfo() {
        System.out.println("브랜드: " + this.brand);
        System.out.println("연로: " + this.fuelLevel);
        System.out.println("차종: 가솔린 차");
    }

    public void fillGas() {
        System.out.println("만땅까지 주유합니다.");
        this.fuelLevel = 100;
    }

}
