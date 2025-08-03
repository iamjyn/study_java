package com.study._03_Operator;

public class Operator3 {
    public static void main(String[] args) {
        // 비교연산자: 연산결과 boolean
        int a = 2;
        int b = 3;

        System.out.println(a == b); // 같은가
        System.out.println(a != b); // 다른가
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        // 결과를 변수에 대입 가능
        boolean isEqual = a == b;
        System.out.println(isEqual);

        // 문자열 비교
        // 문자열의 값을 비교할 땐 == 대신 .equals() 사용!
        // "." : 참조한다(메모리 주소로 찾아가겠다)
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1과 str2 값 비교: " + str1.equals(str2));

        /*
        - 자료형 분류
        1. 원시형: int, double, long.. (첫글자가 소문자인 타입)
        2. 참조형: String

        - 뭐가 다를까?
        JVM(실제 java 코드를 실행하는 녀석)의 메모리
        : Stack + Heap
        Stack: 용량이 작다. 빠르다. - 책상
            - 원시자료형 데이터가 직접 저장되어 있음
            - 참조자료형 데이터는 Heap에 저장되어있는 주소만 저장(0x1A2B)
        Heap: 용량이 크다. 느리다. - 도서관
            - 참조자료형 데이터가 직접 저장되어 있음
            - 0x1A2B: "hello"
        */
    }
}
