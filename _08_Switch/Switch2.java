package com.study._08_Switch;

public class Switch2 {
    public static void main(String[] args) {
        // 자바 14부터 지원하는 switch 문법(소개)

        // 기존 switch문의 불편함
        // break를 일일이 선언
        // 일일이 초기화를 분기시킴

        // 등급에 따라 쿠폰을 다르게 뿌리는 경우
        // int coupon:
        // case "등급이름": 1000; break;

        String grade = "VVIP";

        // 함수형 프로그래밍 표현식
        // 대입연산자(=)로 연산결과가 직접 대입됨
        int coupon = switch (grade) {
            case "NORMAL" -> 1000;
            case "VIP" -> 2000;
            case "VVIP" -> 3000;
            default -> 500;
        };

        System.out.println("발급받은 쿠폰: " + coupon + "원");

    }
}
