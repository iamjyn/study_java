package com.study._03_Operator;

public class Operator6 {
    public static void main(String[] args) {
        // 삼항연산자 - if 조건문이랑 '비슷'하다
        int x = 5;
        int y = 3;
        // 조건 ? 참일때의 값 : 거짓일때의 값
        int max = (x > y) ? x : y;
        System.out.println(max);

        int a = 3;
        int b = 3;
        boolean isSame = (a == b) ? true : false;
        String sameStr = (a == b) ? "같음" : "다름";
        System.out.println(isSame);
        System.out.println(sameStr);

        /*
        키가 120이상이면 "탑승 가능", 불가능하면 "탑승 불가능"
        문자열을 result 변수에 담아서 출력!
        */

        int height = 119;
        int age = 25;
        // 키가 120이하더라도, 성인이면 탑승 가능
        // 삼항연산자 또하 연산자이기 때문에 중첩이 가능하다.
        // 권장) 한번 이상 중첩하지 말자
        String result = height >= 120 ? "탑승 가능" : age >= 20 ? "탑승 가능" : "탑승 불가능";
        System.out.println(result);

    }
}
