package com.study._17_Class;

public class ClassMain2 {
    public static void main(String[] args) {
        /*
        절차지향 프로그래밍 <> 객체지향 프로그래밍 (상반된 개념이 아니다)
        - 절차지향
        : 메뉴얼처럼 순서대로 진행(코드가 위에서 아래로 순서를 가짐)
        실행 순서 중심. "어떻게?" 작동하는가

        - 객체 지향
        : "어떻게?"를 철저하게 숨긴다. -> 메서드를 통해서
        객체간 상호작용 중심. "누가?", "무엇이?"
        */

        // 자동차 초기상태
        int speed = 0; // 속도
        boolean isEngineOn = false; // 시동 여부

        // 시동켜기
        isEngineOn = true;
        System.out.println("자동차 시동을 켭니다.");

        // 주행
        speed += 20;
        System.out.println("자동차 속도: " + speed);

        speed -= 10;
        System.out.println("자동차 속도: " + speed);

        // 상태확인
        if (isEngineOn) {
            System.out.println("시동켜져 있음");
            System.out.println("현재속도: " + speed);
        } else {
            System.out.println("시동꺼져 있음");
        }

        // 시동끄기
        isEngineOn = false;
        speed = 0;
        System.out.println("자동차 시동을 끕니다.");

        // 객체지향 코드
        Car car = new Car(); // 초기값 -> speed:0, isEngineOn: false

        // 주어 + 동사 -> 자동차가 주행하는 것처럼 코드가 작성됨
        // 클래스이름은 명사로 작명, 메서드이름은 동사+목적어로 작명
        // 작동코드는 철저히 숨겨짐
        car.engineStart(); // -> startEngine
        car.accelerate();
        car.accelerate();
        car.brake();
        car.showStatus();
        car.engineStop(); // car가 heap 메모리에 저장한 값들을 참조하여 작동하겠다
        // engineStart(); // 단독으로 사용불가
        // 객체의 필드값이 필요한 메서드들 -> heap 주소가 필요하다

        Car car1 = new Car();
        car1.engineStart();
        car1.accelerate(); // 0 -> 10 / car1.speed -> 10

        Car car2 = new Car();
        car2.engineStart();
        car2.accelerate(); // 0 -> 10
        car2.accelerate(); // 10 -> 20 / car2.speed -> 20


        // 학생 -> 이름, 학번, 성적 (공통점을 뽑아내는 것? 추상화)
        // 동물 -> 소리를 낸다 (메서드로 추상화)
        // 자동차 -> 속도, 최종상태(속성) / 시동 걸고,끄고,과속,브레이크(기능)

        /*
        객체: 속성(데이터) + 기능(메서드)으로 추상화된 것
        객체지향(OOP 프로그래밍의 특징) 4가지
        1. 캡슐화
            데이터와 기능을 하나의 객체로 묶은 것(포장한 것)
            -> 은닉이 가능하다.
        2. 추상화
            복잡한 내부 구현을 숨기고, 간단한 인터페이스만 제공
            여러 객체의 공통속성 및 동작을 상위 클래스로 일반화 하는 것
            (-> 상속과 이어짐)
        3. 상속(나중에 배울 예정)
            여러 객체의 공통속성 및 동작을 상위 클래스로 일반화 하는 것
            // 게임캐릭터
            // 기본캐릭터(상위클래스) -> 전직캐릭터1(전사), 전직캐릭터2(도적)
        4. 다형성(나중에 배울 예정)
            같은 이름의 메서드이지만, 동작이 다른 것
            문법적으로 다형성을 구현하도록 강제되어 있음
                기본캐릭터.공격() -> 기본공격
                도적.공격() -> 칼로 때린다
                법사.공격() -> 마법으로 때린다
        */

    }
}
