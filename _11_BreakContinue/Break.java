package com.study._11_BreakContinue;

public class Break {
    public static void main(String[] args) {
        // 반복문 - break
        // switch - break -> 탈출
        // break를 읽으면, for 혹은 while 중괄호를 즉시 탈출한다.

        // 맛집에 50명이 웨이팅 중
        // 맛집 재고 10개
        int waiting = 50;
        int max = 10;

        for (int i = 1; i <= waiting; i++) { // 50번 반복
            System.out.println(i + "번째 손님 입장하세요~");
            if (i == max) {
                System.out.println("재료소진.. 마갑입니다.");
                break; // 10번째 반복에서 break 읽고 탈출
                // 가까운 반복문 중괄호 한번만 탈출
            }
        }

    }
}
