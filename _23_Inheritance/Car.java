package com.study._23_Inheritance;

// 상속: 부모(상위)클래스 / 자식(하위)클래스
public class Car {
    // Car는 부모클래스(공통 필드, 공통 메서드를 제공하는 기초 뼈대)
    // 모든 차가 공통으로 가져야 할 필드/메서드를 정의 - 추상화

    protected String brand; // 자신 && 같은 패키지만 접근 가능하다
    private int year; // 생산연도

    public Car(String brand) {
        System.out.println("부모(Car) 생성자 호출 됨!");
        this.brand = brand;
    }

    public Car() {
        System.out.println("부모(Car) 생성자 호출 됨!");
        this.brand = "기본브랜드";
    }

    // 자동차라면 할 수 있는 기본 동작
    public void move() {
        System.out.println("차가 이동합니다.");
    }

    public void openDoor() {
        System.out.println("문을 엽니다.");
    }

    public void showInfo() {
        System.out.println("브랜드: " + brand);
    }

}
