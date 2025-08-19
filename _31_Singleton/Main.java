package com.study._31_Singleton;

public class Main {
    public static void main(String[] args) {
        LogManager logger1 = LogManager.getInstance();
        LogManager logger2 = LogManager.getInstance();
        LogManager logger3 = LogManager.getInstance();
        logger1.log("첫 번째 로그");

        System.out.println(logger1 == logger2);
        System.out.println(logger1 == logger3);

        // 스프링 프레임워크에서는 대부분의 객체를 싱글톤으로 관리함

        // AppConfig를 싱긅톤을 적용하여 구현해 주세요.

    }
}
