package com.study._17_Class.phone;

public class Phone {
    int battery;
    boolean isPowerOn;

    void turnOn() {
        if (battery >= 10) {
            isPowerOn = true;
            System.out.println("휴대폰 전원이 켜집니다.\n");
        } else {
            System.out.println("배터리가 부족합니다.(최소 10)\n");
        }
    }

    void turnOff() {
        isPowerOn = false;
        System.out.println("휴대폰 전원이 꺼집니다.\n");
    }

    void call() {
        if (isPowerOn) {
            System.out.println("통화 중입니다.\n");
            battery -= 10;
            } else {
            System.out.println("전원을 먼저 켜주세요.\n");
        }
    }

    void charge() {
        battery += 20;
        if (battery > 100) {
            battery = 100;
            }
        System.out.println("충전이 완료되었습니다.\n> 배터리 잔량: " + battery + "\n");
    }

    void showStatus() {
        System.out.println("[배터리 상태 확인]");
        if (isPowerOn) {
            System.out.println("전원이 켜져있습니다.\n> 배터리 잔량: " + battery + "\n");
        } else {
            System.out.println("전원이 꺼져있습니다.");
        }
    }
}
