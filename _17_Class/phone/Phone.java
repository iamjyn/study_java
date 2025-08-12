package com.study._17_Class.phone;

public class Phone {
    int battery;
    boolean isPowerOn;

    void turnOn() {
        if (battery >= 10) {
            isPowerOn = true;
            System.out.println("전원을 켭니다");
        } else {
            System.out.println("배터리가 부족합니다.(최소 10)");
        }
    }

    void turnOff() {
        isPowerOn = false;
        System.out.println("전원을 끕니다");
    }

    void call() {
        if (isPowerOn) {
            System.out.println("전화를 겁니다");
            battery -= 10;
        } else {
            System.out.println("전원을 먼저 켜주세요");
        }
    }

    void charge() {
        battery += 20;
        if (battery > 100) {
            battery = 100;
        }
        System.out.println("배터리 충전완료. 배터리: " + battery);
    }

    void showStatus() {
        if (isPowerOn) {
            System.out.println("전원 on, 배터리: " + battery);
        } else {
            System.out.println("전원 off");
        }
    }

}
