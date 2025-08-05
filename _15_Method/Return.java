package com.study._15_Method;

import java.util.Scanner;

public class Return {
    // [접근제한자] [static 유무] [리턴 타입] [매개변수...]() {}
    // 리턴값이 존재한다면 void 대신 반환할 데이터의 자료형을 명시한다.
    public static int addNumber(int num1, int num2) {
        int result = num1 + num2;

        return result; // 리턴할 데이터
    }

    public static String addNim(String name) {
        String result = name + "님";

        return name + "님";
    }

    // 위랑 같음
//    public static String addNim(String name) {
//        return name + "님";
//    }

    public static Scanner getScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public static String getAdult(int age) {
        if (age >= 20) {
            return "성인";
        } else {
            return "미성년자";
        }
        // 위의 return 으로 메서드가 종료가 되기 때문에
        // 아래 코드는 실행 될 수 없다.
        // System.out.println("나는 실행이 안됨");
    }

    public static void main(String[] args) {
        int addResult = addNumber(10, 20);
        System.out.println("결과: " + addResult);

        // return이 있는 메서드의 경우,
        // 리턴되는 data가 값이라면 값, 객체라면 객체로 다룰 수 있다.
        // addNumber(10,20)이 마치 값 30처럼 다뤄진다.
        int addResult2 = addNumber(addNumber(10, 20), 30);
        System.out.println("결과: " + addResult2);

        String name = "홍길동";
        String strResult = addNim(name); // "홍길동님" 문자열(객체) 됨
        System.out.println(strResult);
        // 리턴되는 data가 문자열 객체이기 때문에
        // 문자열 메서드를 바로 호출할 수 있다.
        System.out.println(addNim(name).equals("김길동님"));

        // 리턴되는 data가 스캐너 객체이기 때문에
        // 스캐너의 메서드를 바로 호출할 수 있다.
        getScanner().nextLine();

        /*
        메서드에서 return을 만나면 벌어지는 일
            1. 메서드 즉시 종료(탈출)
            2. 호출한 곳으로 값 전달(return 값)
            3. 메모리 정리(stack 메모리가 사라짐)
        */

    }
}
