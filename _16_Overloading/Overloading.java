package com.study._16_Overloading;

public class Overloading {
    /*
    메서드 오버로딩(과적)
    같은 이름의 메서드를 여러 개 선언하는 것
    매개변수(파라미터)의 타입/순서/갯수가 다르면
    같은 메서드 이름을 선언할 수 있다.

    JVM이 메서드를 인식하는 기준
    : 메서드 시그니처(이름 + 매개변수 타입 목록)
    */

    // Overloading 클래스의 시그니처 : [printAddNum(1: int, 2: int)]
    public static void PrintAddNum(int a, int b) {
        System.out.println("두 수의 합: " + (a + b));
    }

    // Overloading 클래스의 시그니처 : [printAddNum(1: int, 2: int)]
    // 매개변수의 이름만 바뀌었을 뿐 타입은 동일 -> 시그니처 동일
    // -> JVM은 구별할 수 없다.
//    public static void PrintAddNum(int b, int a) {
//    System.out.println("두 수의 합: " + (a + b));
//    }

    // Overloading 클래스의 시그니처 : [printAddNum(1: double, 2: int)]
    // 서로 다른 시그니처 -> JVM이 구별할 수 있다!
    public static void PrintAddNum(double a, int b) {
        System.out.println("두 수의 합: " + (a + b));
    }

    // Overloading 클래스의 시그니처 : [printAddNum(1: int, 2: double)]
    // 서로 다른 시그니처 -> JVM이 구별할 수 있다!
    public static void PrintAddNum(int a, double b) {
        System.out.println("두 수의 합: " + (a + b));
    }

    public static void printNum(int a) {
        System.out.println("넘어온 값: " + a);
    }

    public static void printNum(double a) {
        System.out.println("넘어온 값: " + a);
    }

    /*
    1. 정확하게 매칭되는 시그니처의 메서드를 찾는다.
    - int를 넘겼으니, int를 받아주는 메서드를 찾는다.
    2. 없으면, "자동 형변환"이 가능한 시그니처의 메서드를 찾는다.
    *)자동형변환: 작은타입 -> 큰타입으로 형변환하는 것
    */

    public static void main(String[] args) {
        printNum(1);
    }
}
