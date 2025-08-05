package com.study._09_For;

public class For {
    public static void main(String[] args) {
        // for 반복문
        /*
            for(초기식-변수초기화; 조건식; 증감식;) {
                반복될 코드
            }
        */
        
        // int i = 0; (초기식: for문 내에서 쓸 변수)
        // i < 10 (조건식: 조건식이 false가 될 때까지 반복)
        // i++ (증감식: 매 반복마다 변수를 조작)

        for (int i = 1; i < 6; i += 2) {
            // i는 for문 중괄호 내에서만 살아있음
            System.out.println(i + "번째 반복");
        }

        int a = 1; // for문 밖에서도 유효한 변수 선언
        for (; a < 6; a++) {
            System.out.println("첫 번째 반복: " + a);
        } // 자격증 시험에서 좋아한다.

        System.out.println(a); // 6

        for (; a < 10; a++) {
            System.out.println("두 번째 반복: " + a);
        }

        System.out.println(a); // 10

        System.out.println("=".repeat(50));

        // 1 ~ 10 출력, 짝수만 출력
        // 1. 10번 반복하는데, if문으로 출력만 짝수에 하는 방법
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("짝수 : " + i);
            }
        } // 10번 반복

        // 2. 증감식을 조작해서, 2씩 증가시켜서 출력하는 방법
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("증감식 짝수 : " + i);
        }

        // 초기식 -> (조건식검사 -> 코드블록실행 -> 증감식)x n번 -> 조건식 검사 false일 때 탈출

        // 반복문으로 1~100까지의 합을 구해보자
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            // sum = sum + i;
        }
        System.out.println("총합 : " + sum);

        // 실습) 1~100 중에 짝수합, 홀수합을 따로 구해서 출력
        int evenSum = 0; // 짝수누적합
//        for (int i = 2; i <= 100; i += 2) {
//            evenSum += i;
//        }
//        System.out.println("짝수누적합: " + evenSum);

        int oddSum = 0; // 홀수누적합
//        for (int i = 1; i <= 100; i +=2) {
//            oddSum += i;
//        }
//        System.out.println("홀수누적합: " + oddSum);

        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println(oddSum);
        System.out.println(evenSum);

    }
}
