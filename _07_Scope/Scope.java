package com.study._07_Scope;

public class Scope {
    public static void main(String[] args) {
        // 스코프(범위)
        // 변수의 스코프(범위)
        // 변수는 선언된 중괄호 안쪽에서만 존재할 수 있다.
        int m = 10; // m이라는 변수의 생존 시작.
        if(true) {
            int x = 20; // x 변수 생존 시작
            System.out.println("m =" + m);

            if (true) {
                int y = 30; // y 변수 생존 시작
                System.out.println("m =" + m);
                System.out.println("x =" + x);
            } // y 생존 종료
            int y = 20; // 같은 이름이라도 if 안쪽 y와는 다른 변수

        } // x 생존 종료

        // System.out.println(x); x가 생존하지 않아서 인식 불가

    } // m 생존 종료
}
