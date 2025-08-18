package com.study._29_Wrapper;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 자바 외부로 부터 들어오는 데이터 -> 보통 "문자열"

        String[] inputedScore = {"85", "90", "78", "96", "88"};

        // 1. String -> Integer / int(for문)
        Integer[] scores = new Integer[inputedScore.length];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.valueOf(inputedScore[i]); // String -> Integer
        }

        System.out.println(Arrays.deepToString(scores));
        // Arrays.toString()의 한계점: 한꺼풀만 본다
        // [[1,2,3],[4,5,6],[7,8,9]] -> [class@1234, class@5678...]
        // Arrays.deepToString(): 값이 나올 때까지 까서 본다

        // 2. 비교 (for문)
        Integer maxScore = scores[0];
        Integer minScore = scores[0];

        // 최종 최고점, 최저점 Integer 메서드를 사용해서 구하시오!
        for (int i = 1; i < scores.length; i++) {
            maxScore = Integer.max(scores[i], maxScore);
            minScore = Integer.min(scores[i], minScore);
        }
        System.out.println("최고점: " + maxScore);
        System.out.println("최저점: " + minScore);












    }
}
