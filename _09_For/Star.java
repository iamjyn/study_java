package com.study._09_For;

public class Star {
    public static void main(String[] args) {
        // 네모별 찍기
        // *****
        // *****
        // *****
        // *****
        // *****
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++){
                System.out.print("*");
            }
            // 엔터키
            System.out.println();
        }

        // 별 직각삼각형 찍기
        // *
        // **
        // ***
        // ****
        // *****
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 바깥 반복문의 증감식을 조작
        // 5번 반복하는게 1씩 증가시키는 방법, 1씩 감소시키는 방법 두가지
        // *****
        // ****
        // ***
        // **
        // *

        for (int i = 5; i >= 1; i--) { // 바깥반복문 -> 줄 갯수 결정
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 엔터키
        }

    }
}
