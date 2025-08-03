package com.study._03_Operator;

public class Operator5 {
    public static void main(String[] args) {
        // 복합대입연산자

        int a = 5;

        // 기본방법
        a = a + 3; // a를 3 증가시키기

        // 축약방법
        a += 3; // a = a + 3과 같음
        a -= 3; // a = a - 3과 같음
        a *= 2; // a = a * 2와 같음
        a /= 2; // a = a / 2와 같음
        a %= 4; // a = a % 4와 같음

        // 연산자 우선순위 (자격증 시험에서 잘 나옴)
        /*
        1. 괄호 ()
        2. 단항연산자 (++, --, !)
        3. 산술연산자 (*, /, % 먼저 그 다음 +, -)
        4. 비교연산자 (<, >, <=, >=)
        5. 등식연산자 (==, !=)
        6. 논리연산자 (&&, ||)
        7. 대입연산자 (=, +=, -=, ...)
        */

        int num1 = 5;
        int num2 = 3;
        boolean result = num1 > num2 && num1 + num2 < 10;
        // num1 + num2(산술) -> num1 > num2(비교) -> 비교 -> &&(논리)
        // 우선순위가 높은 것 먼저 실행
        // 동일할 경우 왼쪽부터 실행
        System.out.println(result);
    }
}
