package com.study._10_While;

public class DoWhile {
    public static void main(String[] args) {
        /*
        do {
        // 조건이 참인동안 반복코드
        } while(조건식)
        // 최소 한번은 실행되는 while 반복문 문법(결과론적 설명)

        // while: (조건확인 -> 실행) x N번
        // do-while: (실행 -> 조건확인) x N번
        */

        int count = 1;
        do {
            System.out.println("현재 count: " + count);
            count++;
        } while (false); // 실행하고 -> 조건확인

    }
}
