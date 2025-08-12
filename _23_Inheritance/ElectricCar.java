package com.study._23_Inheritance;

public class ElectricCar extends Car {
    /*
    상속은 extends 키워드로 받을 수 있다.
    -> 자식클래스가 되고, 부모의 모든 public / protected로 선언된 필드를 사용할 수 있다.
    -> 부모의 private 필드는 쓸 수 없음
    -> 부모의 메서드도 자동으로 사용이 가능하다.

    [Heap 메모리]
    상속받은 자식 객체 생성시(new)
    객체 -> [부모필드 정보 | 자식필드 정보] 같이 생성 됨

    부모 객체 생성시
    객체 -> [부모필드 정보]
    // 1. 메모리상 구분되어 있지 않음 -> JVM이 구분해서 읽음
    // 2. 부모필드의 private도 메모리에 올라간다.(JVM이 접근을 안함)

    [메서드 영역]
    메모리는 클래스별로 구분되어 있음
    -- 부모 클래스 --
    클래스에 대한 정보
    클래스에 정의된 메서드들
    -- 자식 클래스 --
    클래스에 대한 정보
    클래스에 정의된 메서드들(시그니처)
    부모 클래스가 누군지 기록이 되어 있음
    -> 객체가 메서드를 호출하면 JVM은 자식클래스 메서드 시그니처를 탐색
    -> 없으면 부모클래스 메서드 시그니처를 탐색
    */

    // 전기차만 가지는 고유한 필드
    private int batteryLevel;

    // [brand | batteryLevel]
    // super() -> brand(부모 필드) 초기화
    // 이후에 batteryLevel(자식 필드) 초기화
    // super()랑 this()는 중복 사용이 x -> 생성자의 맨 윗줄에 위치해야 함
    // 상속한 클래스의 경우에는 super() 권장
    public ElectricCar() {
        super(); // 부모클래스 기본 생성자를 호출(생략 가능)
        System.out.println("전기차 생성자 호출!");
        this.batteryLevel = 100;
    }

    public ElectricCar(String brand) {
        super(brand); // Car(String brand) {} 호출
        // 생략시 기본생성자(super())가 호출되기 때문에
        // 매개변수가 있는 생성자는 super() 생략 불가능
        System.out.println("전기차 생성자 호출!");
        this.batteryLevel = 100;
    }

    // 자식에게만 있는 메서드
    public void showDetailInfo() {
        super.showInfo(); // 부모의 메서드 호출
        System.out.println("차종: 전기차");
        System.out.println("배터리 잔량: " + batteryLevel);
    }

    /*
    [brand | batteryLevel]
    this -> heap 메모리에 있는 객체 자신의 주소
    super -> heap 메모리에 있는 객체에서 부모로 부터 받은 부분(부분집합)
    super는 엄밀히 말하면 객체 참조가 아닙니다.
    super.필드 -> heap에서 부모 영역만 따로 구분지어 읽어라
    super.메서드() -> 메서드 영역에서 메서드 시그니처를 자식클래스말고, 부모클래스 기준으로 찾아라

    상속받은 a라는 필드가 있을 때
    super.a += 1
    this.a -> 확인 시 1이 더해져 있음
    */

    public void charge() {
        System.out.println("완충상태까지 충전합니다.");
        this.batteryLevel = 100;
    }

}
