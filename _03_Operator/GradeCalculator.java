package com.study._03_Operator;

public class GradeCalculator {
    public static void main(String[] args) {
        /*
        1. 총점과 평균을 계산하여 출력
        2. 평균 기준
        90 이상 A학점
        80-89 B학점
        70-79 C학점
        70미만 D학점
        평균기준으로 boolean 변수들에 true / false를 대입

        //최종 출력
        총점:
        평균:
        A학점 해당: true / false
        B학점 해당: true / false
        C학점 해당: true / false
        D학점 해당: true / false
        */

        // 학생점수
        int math = 85;
        int eng = 92;
        int sci = 78;

        int totalScore = math + eng + sci;
        double averageSore = totalScore / 3.0 ;

        boolean isGradeA = averageSore >= 90;
        boolean isGradeB = averageSore < 90 && averageSore >= 80;
        boolean isGradeC = averageSore < 80 && averageSore >= 70;
        boolean isGradeD = averageSore < 70;

        System.out.println("총점: " + totalScore);
        System.out.println("평균: " + averageSore);
        System.out.println("A학점 해당: " + isGradeA);
        System.out.println("B학점 해당: " + isGradeB);
        System.out.println("C학점 해당: " + isGradeC);
        System.out.println("D학점 해당: " + isGradeD);

    }
}
