package com.study._31_Singleton;

public class LogManager {
    /*
    디자인패턴: Singleton, Builder
    -> 객체를 조작하는 여러 패턴(방법론)

    // 싱글톤
    : 단 하나의 인스턴스만 생성하여 공유하도록 하는 패턴
    객체를 여러 번 생성(new)하지 않고, 한번만 만들고 돌려 쓰는 걸 강제

    아래의 3가지 조건이 충족되면 싱글톤이라고 한다.
    1. 생성자의 접근제어자는 private 선언하여 외부로부터 막는다.
    2. 필드로 private 접근제어자를 가진 자기자신의 인스턴스를 가진다.
    3. public static getInstance() 메서드로 객체를 만들고, 반환한다.

    */

    // 인스턴스를 담아둘 static 필드(전역에서 공유)
    private static LogManager instance;

    private LogManager() {} // 생성자를 private로 외부 접근을 막는다.

    public static LogManager getInstance() {
        if (instance == null) { // 필드가 null 이라면
            instance = new LogManager(); // 생성해서 넣어준다.
        } // if문에 걸린다면 최초 호출
        return instance; // 그 다음 호출부터, 이전에 생성했던 instance 그대로 반환
    }

    public  void log(String msg) {
        System.out.println("log" + msg);
    }

}
