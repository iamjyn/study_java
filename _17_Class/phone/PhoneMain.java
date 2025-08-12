package com.study._17_Class.phone;

public class PhoneMain {
    public static void main(String[] args) {
        /*
        실습)
        1. Phone 클래스를 작성해 주세요 -> phone 패키지 내부에 생성
        battery (int) : 배터리 잔량
        isPowerOn (boolean) : 전원 상태

        turnOn(): 전원 켜기 - 배터리가 10 이상일때만 켜지도록
        turnOff(): 전원끄기
        call(): 전원이 켜져있고, 통화시(call 호출시) 배터리 10 소모
        charge(): 배터리 20 충전, 최대(100)
        showStatus(): 상태확인(전원상태, 배터리잔량 출력)

        2. 잘 작동하는가 아래에 테스트 코드를 작성
        */

        Phone phone = new Phone();

        phone.call();
        phone.charge();
        phone.turnOn();

        phone.call();
        phone.charge();

        phone.showStatus();
        phone.call();

        phone.turnOff();
        phone.showStatus();

    }
}
