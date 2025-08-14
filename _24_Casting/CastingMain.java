package com.study._24_Casting;

import com.study._23_Inheritance.Car;
import com.study._23_Inheritance.ElectricCar;
import com.study._23_Inheritance.GasCar;

public class CastingMain {
    /*
    캐스팅이란?
    - 타입을 변경해 주는 것
    - 업캐스팅: 자식 -> 부모 타입으로 변경
    - 다운캐스팅 : 부모 -> 자식 타입으로 변경
    *정보소실은 일어나지 않음
    코드(.java) -> 컴파일(.class) -> 실행 -> 종료
                     컴파일러            JVM
    1. 컴파일 시점: 컴파일러가 코드를 컴파일 실행하는 시점
    2. 런타임 시점: 프로그램이 실행되고 종료되는 사이 시점
    */

    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("테슬라");
        Car carTesla = (Car) tesla; // 업캐스팅 / (Car)생략가능

        // 자동 업캐스팅
        Car EV6 = new ElectricCar("기아"); // 한번에 업캐스팅

        // 실제 객체는 무슨 타입? : new로 생성된 객체(메모리에 존재)
        // 컴파일러는 ElectricCar 객체를 Car로 검사하겠다.
        // 일반화: 컴파일러는 좌변기준(변수타입)으로 검사한다.

        // heap 메모리에는 부모/자식 정보가 다 올라감(new 기준)
        // Car(부모)의 영역으로만 제한해서 검사하겠다.(컴파일러 시점)
        // 컴파일러가 Car타입으로 제한해서 보니까 charge라는 메서드가 없다
        // EV6.charge() -> 실제로는 charge()메서드가 있지만, 컴파일 에러발생

        Car gasCar = new GasCar("기아");
        gasCar.move();
        // 부모에도 move()라는 메서드가 있어서 컴파일러는 통과 시켜 줌
        // 실제 호출 시에는 JVM이 자식의 메서드를 호출(런타임 시점)
        // 동적바인딩: 실제 new로 생성된 객체 기준으로 메서드가 호출된 것
        // 일반화: JVM은 메서드 호출 시 우변기준으로 탐색한다.

        Car car = new Car("현대");
        // ElectricCar wrongCar = (ElectricCar) car;
        // 다운캐스팅: 부모 -> 자식 (런타임 에러를 주의해야한다)

        Car car2 = new GasCar("기아"); // 자동 업캐스팅
        GasCar gCar = (GasCar) car2;

        // instanceof 연산자
        // 1. new로 생성된 객체기 특정 타입인지 확인해주는 연산자
        // 2. true / false 반환
        // 3. 상속관계도 고려: 자식객체는 부모타입으로 검사하면 true
        // 4. 인터페이스도 고려: 이식받은 객체는 인터페이스 타입으로 검사하면 true
        System.out.println("테슬라는 전기차인가? " + (tesla instanceof ElectricCar));
        System.out.println("테슬라는 차인가? " + (tesla instanceof Car));

        // 업캐스팅 배열로 관리 가능
        Car[] cars = {
                new ElectricCar("테슬라"),
                new GasCar("제네시스")
        };

        // 다형성으로 가능한 것들
        // 결제시스템 -> 부모(Payment) pay()라는 메서드 존재
        // 자식클래스로 NaverPayment, KakaoPayment -> pay() 메서드를 오버라이딩
        // Payment myPayment = new NaverPayment()
        // myPayment.pay() -> 네이버 기준으로 결제 진행
        // Payment myPayment = new KakaoPayment()
        // myPayment.pay() -> 카카오 기준으로 결제 진행

        for (Car myCar : cars) {
            myCar.move(); // 다형성(이름은 같은데, 동작이 다름)

            if (myCar instanceof ElectricCar) {
                ElectricCar eCar = (ElectricCar) myCar; // 안전한 다운캐스팅
                eCar.charge(); // 자식의 고유한 메서드 호출 가능
            } else if (car instanceof GasCar) {
                GasCar gCar2 = (GasCar) myCar; // 안전한 다운캐스팅
                gCar2.fillGas(); // 자식의 고유한 메서드 호출 가능
            }
            // instanceof
            // 왼쪽 객체가 오른쪽 타입에 대입이 가능한가?
            // 왼쪽 객체가 오른쪽 클래스의 메모리 부분을 가지고 있는가?
        }
    }

}
