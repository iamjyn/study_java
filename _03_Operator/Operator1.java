package com.study._03_Operator;

public class Operator1 {
    public static void main(String[] args) {
        /*
        연산자는 계산을 수행하는 기호

        산술연산자 : 사칙연산(+, -, *, /, %(나머지연산))
        */

        // 변수 초기화
        int a = 5;
        int b = 2;
        int sum = a + b;
        System.out.println(sum);  //println - ln은 라인 준말로 엔터키 포함해서 프린트

        // 문자열 덧셈
        String result1 = "hello " + "world";
        System.out.println(result1);

        // 문자열 + 다른자료형(다른자료형이 문자열로 자동 변환됨)
        String result2 = "a + b = " + 7;
        System.out.println(result2);

        int one = 1;
        int two = 2;

        // 우선순위가 같은 사칙연산은 왼쪽부터 차례대로 계산
        // one + two = 12
        System.out.println("one + two = " + one + two);

        // (괄호)로 우선순위를 높여서 계산 => 3
        System.out.println("one + two = " + (one + two));

        System.out.println(a - b);
        System.out.println(a * b);

        int division = a / b; // 5 / 2
        System.out.println(division); // 2 소숫점 버림(int)

        // 나머지연산
        int remain = a % b; // 5 / 2 -> 1 (나머지)
        System.out.println(remain);
        // 배수판별 할 때, a가 3의 배수다 : a % 3 -> 0
        // a가 짝수다 : a % 2 -> 0, a가 홀수다 : a % 2 -> 1
        // 10시 + 30시간
        // 10시 + (30 % 24) -> 16시
    }
}
