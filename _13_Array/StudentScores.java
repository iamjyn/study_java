package com.study._13_Array;

public class StudentScores {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88, 76, 95, 82, 89, 91};
        /*
        요구 사항
        1. 모든 학생 점수의 총합(totalSum)을 구하여 출력해주세요.
        2. 전체 점수 평균(average)을 구해서 출력해 주세요.
        3. 평균 이상인 점수의 갯수(overAvgCount) 구하여 출력해 주세요.
        4. 최고 점수(maxScore)를 찾아 출력해 주세요.
        */

        int totalSum = 0;
        for (int score : scores) {
            totalSum += score;
        }
        System.out.println("1. 총합: " + totalSum + "점");

        double average = (double) totalSum / scores.length;
        System.out.println("2. 평균 점수: " + average + "점");

        // 반복문을 순회하면서
        // 평균 점수보다 큰 점수를 발견하면 +1 카우느
        int overAvgCount = 0;
        for (int score : scores) {
            if(score >= average) {
                overAvgCount++;
            }
        }
        System.out.println("3. 평균 이상인 점수의 갯수: " + overAvgCount + "개");

        int maxScore = scores[0]; // 0번으로 초기화
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }
        System.out.println("4. 최고 점수: " + maxScore + "점");

    }
}
