package com.study._12_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        // (자료)형변환 -> 데이터 타입(자료형)을 다른 타입(자료형)으로 변경하는 것
        // 용량기준으로
        // 큰 -> 작은 : 데이터가 넘칠 수 있다(데이터 유실 가능성이 있다) -> 명시적 형변환 필요
        // 작은 -> 큰 : 데이터 유실 가능성이 없음 -> 자동 형변환

        // 작은 -> 큰 : 자동 형변환
        int intValue = 10; // 4byte - 21억 까지
        long longValue; // 8byte
        double doubleValue; // 8byte

        longValue = intValue; // 10L 자동 형변환
        doubleValue = intValue; // 10.0으로 자동 형변환

        // 큰 -> 작은
        doubleValue = 1.5;
        // intValue = doubleValue;
        intValue = (int) doubleValue; // (자료형) -> 명시적 형변환
        System.out.println("소숫점 사라짐(버림): " + intValue);

        // 서로 다른 자료형끼리의 연산
        // 다른 자료형끼리 연산 -> 결과 : 더 큰 범위 타입으로 자동 형변환 됨

        intValue = 1;
        doubleValue = 1.5;
        System.out.println(intValue + doubleValue); // 2.5

        // 오버플로우
        // 데이터가 용량이 넘쳐서 이상한 작동을 하는 경우

        // int 범위: 약 -21억 ~ 21억
        long maxIntValue = 2_147_483_647L; // int의 최댓값
        long overIntValue = 2_147_483_648L; // int의 최댓값 + 1

        intValue = (int) maxIntValue; // safe
        System.out.println(maxIntValue);

        intValue = (int) overIntValue; // overflow 발생
        System.out.println(intValue);

        // 1. 명시적으로 형변환시 주의 해야한다.
        // 2. 아무리 출발하는 서비스가 작더라도, long 타입을 고려하자.

    }
}
