package com.study._17_Class;

public class Car {
    // 필드(값,변수), 멤버변수, 속성, 상태
    int speed;
    boolean isEngineOn;

    // 초기값
    /*
    참조자료형 -> 초기화 안하면 null
    정수들 int, long.. -> 0
    소수들 double -> 0.0
    boolean -> false
    */

    // 엔진을 켜주는 메서드
    void engineStart() {
        isEngineOn = true;
        System.out.println("자동차 시동을 켭니다");
    }

    // 엔진을 끄는 메서드
    void engineStop() {
        isEngineOn = false;
        speed = 0;
        System.out.println("자동차 시동을 끕니다");
    }

    // 자동차 현재 상태를 콘솔에 보여주는 메서드
    void showStatus() {
        System.out.println("자동차 상태 확인");
        if (isEngineOn) {
            System.out.println("시동 on, 현재속도: " + speed);
        } else {
            System.out.println("시동 off");
        }
    }

    // 속도 올리는 메서드
    void accelerate() {
        // 객체의 상태에 따라
        // 유효성을 검증이 가능하다
        if (isEngineOn) {
            speed += 10;
            System.out.println("현재속도: " + speed);
        } else {
            System.out.println("시동을 먼저 켜주세요");
        }
    }

    // 감속
    void brake() {
        if (speed > 0) {
            speed -= 10;
            if (speed < 0) {
                speed = 0; // -스피드가 되면 그건 0으로 쳐라
            }
            System.out.println("현재속도: " + speed);
        } else {
            System.out.println("이미 속도가 0입니다");
        }
    }

}
