package com.study._06_if;

public class If {
    public static void main(String[] args) {
        /*
        if(조건문(논리연산을 포함한)) {
            // 조건이 참일 때 (true일 때) 실행되는 코드
        }
        */
        int height = 100;
        boolean isAdult = false; // 성인인가? false

        // 최종적으로 if(boolean 데이터)
        if (height >= 120 && !isAdult) {
            System.out.println("탑승 가능합니다!");
        }

        // if ~ else문
        // else는 위쪽 if문 조건이 모두 거짓일 경우 실행되는 코드 블럭
        // if ~ else문에서는 반드시 하나의 코드 블럭만 실행된다.

        if (height >= 120) {
            System.out.println("탑승 가능합니다!");
        } else { // height < 120
            System.out.println("탑승 불가능합니다!");
        }

    }
}
