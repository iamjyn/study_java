package com.study._29_Wrapper;

public class WrapperMain {
    public static void main(String[] args) {
        /*
        java.lang 패키지에 존재하는 클래스(jdk 설치시 자동설치)
        원시자료형(int, double, boolean...) 한계점이 존재
        객체가 아니므로,
        1. 메서드를 가질 수 없다.
        num1 = 80;
        num1.compareTo(100) .. 불가능(객체가 아니라서 참조가 안됨)

        2. null 값을 가질 수 없다.
        int 자료형은 초기화하지 않으면 기본값: 0
        int[] score = {1, 10, 5, 0, 0}
        index가 3,4자리가 존재하는 0은 과연 기본값인지 초기화한건지
        구분이 안됨 -> 의도적으로 0으로 값을 가져온건지 아닌지 구분 x

        // 원시자료형들을 객체처럼 다룰 수 있게 만들어 놓은 클래스
        -> Wrapper class
        */

        /*
        int -> Integer class
        long -> Long / double -> Double
        원시자료형 -> 래퍼클래스 변환 : 박싱(Boxing)이라고 한다. (반대는 언박싱)
        */

        // 래퍼클래스 객체를 생성(박싱)
        Integer boxedScore1 = Integer.valueOf(80); // int -> Integer
        Integer boxedScore2 = Integer.valueOf("90"); // String -> Integer
        Long boxedLong = Long.valueOf(100L);
        Double boxedDouble = Double.valueOf(95.5);
        Boolean boxedBoolean = Boolean.valueOf(true);

        // 래퍼클래스 -> 원시자료형(언박싱)
        int unBoxedInt = boxedScore1.intValue(); // .intValue() -> getter 역할
        long unBoxedLong = boxedLong.longValue();
        double unBoxedDouble = boxedDouble.doubleValue();
        boolean unBoxedBoolean = boxedBoolean.booleanValue();

        // 오토 박싱
        // 컴파일러가 알아서 Integer.valueOf(95)를 추가
        Integer autoBoxing = 95;

        // 오토 언박싱
        // 컴파일러가 알아서 autoUnBoxing.intValue() 추가
        int autoUnBoxing = autoBoxing;

        // student1 + student2 -> 객체끼리는 원래 사칙연산자 사용 불가능
        Integer num1 = 10; // 오토박싱
        Integer num2 = 20; // 오토박싱

        // 컴파일러가 알아서 언박싱 -> 원시값 더하기 -> 박싱
        System.out.println(num1 + num2);

        // 래퍼"클래스" 객체기 때문에 == 연산자는 사용 불가능
        System.out.println(num1.equals(num2)); // 값이 달라서 false
        System.out.println(num1 == num2); // 주소가 달라서 false
        num2 = 10;
        System.out.println(num1.equals(num2)); // 값이 같아서 true
        System.out.println(num1 == num2); // 주소가 같아서 true
        /*
        Integer 클래스는 객체를 캐싱한다.
        -128 ~ 127 : 총 256개의 객체를 미리 만들어 놓는다.

        - 256개의 객체는 각각 하나씩 존재한다.
        - 256개의 객체는 새로 생성되지 않는다.
        */

        // 래퍼클래스의 주요 메서드
        Integer num = 42;

        // 1. 문자열 반환 42 -> "42"
        String str = num.toString();
        String str2 = Integer.toString(100);

        // 2. 문자열 -> 숫자
        Integer number = Integer.valueOf("456"); // "456" -> 456 (객체)
        int parsingNum = Integer.parseInt("123"); // "123" -> 123 (int 원시자료형)
        System.out.println(number);
        System.out.println(parsingNum);

        // 3. 비교메서드
        int result = num.compareTo(0);
        // 객체보다 값이 크면 1, 작으면 -1, 동등하면 0 리턴
        // if (result > 0), (result < 0), (result == 0)
        System.out.println(result);

        // 4. 유틸리티 메서드
        // 두 값을 비교해서 큰값 리턴 혹은 작은값 리턴
        int max = Integer.max(10, 20); // 20
        int min = Integer.min(10, 20); // 10
        System.out.println(max);
        System.out.println(min);

    }
}
