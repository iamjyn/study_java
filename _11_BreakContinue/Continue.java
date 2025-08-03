package com.study._11_BreakContinue;

public class Continue {
    public static void main(String[] args) {

        int waiting = 50; // 대기인원
        int max = 10; // 판매 가능 갯수
        int noShow = 6; // 노쇼 번호
        int sold = 0; // 현재 판매량

        for (int i =1; i <= waiting; i++) {
            System.out.println(i + "번째 손님 입장~");

            if (i == noShow) {
                System.out.println(i + "번째 손님 노쇼..");
                continue;
                // continue를 읽으면 즉시 다음 반복으로 스킵
                // 아래의 코드들이 진행되지 않음
            }

            sold++; // 노쇼가 아니면 sold가 1 증가

            if (sold == max) {
                System.out.println("재료소진! 마감합니다.");
                break;
            }
        }

    }
}
