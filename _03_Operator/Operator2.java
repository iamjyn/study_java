package com.study._03_Operator;

public class Operator2 {
    public static void main(String[] args) {
        // 좌변 = 우변
        // 우변의 계산이 다 끝나고 나서 좌변에 대입

        int a = 1;
        // 전위증감: 먼저 증가하고 나서 사용
        int b = ++a; // a를 먼저 2로 증가시키고 b에 대입
        System.out.println("전위증감: " + b);

        a = 1;
        // 후위증감: 먼저 사용하고 나서 증가
        b = a++; // a의 현재값(1)을 b에 대입하고 나서 2로 증가
        System.out.println("후위증감: " + b);

        a = 1;
        // 전위감소 : 먼저 감소하고 나서 사용
        int c = --a;
        System.out.println("전위감소: " + c);

        a = 1;
        // 후위감소 : 먼저 사용하고 나서 감소
        c = a--;
        System.out.println("후위감소: " + c);

        // 단독사용시(대입없이 혼자 코드 한줄 차지할 때) 결과 동일
        ++a;
        a++;
    }
}
