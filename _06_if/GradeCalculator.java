package com.study._06_if;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        /*
        1. 스캐너로 점수를 입력받아 주세요.
        2. 입력받은 점수에 따라 학점을 판정한다.
        90이상 A, 80~89 B, 70~79 C, 나머지 D
        3. A혹은 B학점이면 "장학금 대상입니다!" 출력
        4. 아니라면, "장학금 대상이 아닙니다!" 출력
        - 최종출력 -
        점수: ~점
        등급: A,B,C,D 중 하나
        장학금 대상입니다! / 장학금 대상이 아닙니다!
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 >> ");
        int score = scanner.nextInt();
        System.out.println("점수: " + score);

        String grade;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println("등급: " + grade);

        if (grade.equals("A") || grade.equals("B")) {
            System.out.println("장학금 대상입니다!");
        } else {
            System.out.println("장학금 대상이 아닙니다!");
        }

        // 트레이드 오프
        // 여러방법 중 현재 상황에서 내가 취할 수 있는 최선의 방법은 무엇일까

    }
}
