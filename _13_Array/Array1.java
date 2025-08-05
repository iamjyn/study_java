package com.study._13_Array;

public class Array1 {
    public static void main(String[] args) {
        /*
        배열이란?
        - 같은 자료형에 여러 데이터를 한 번에 관리할 수 있는 자료형 / 저장공간
        - 연속된 메모리에 저장되기 때문에 탐색시 속도에서 유리하다.
        - 각 공간마다 고유한 번호(인덱스)가 있어서 정확히 접근 가능하다.
        */

        // 자료형[] / int[] -> int형 배열 타입 선언
        // new int[5] -> 실제로 5칸의 메모리 공간 생성
        // Array는 new로 생성하기 때문에 참조형 타입이다.
        int[] studentScores = new int[5]; // 0, 1, 2, 3, 4
        studentScores[0] = 90;
        studentScores[1] = 80;
        studentScores[2] = 70;
        studentScores[3] = 60;
        studentScores[4] = 50;
        System.out.println("0번칸: " + studentScores[0]);

        // 배열의 또 다른 초기화 방법
        // 선언 / 초기화를 동시에
        int[] scores = new int[]{90, 80, 70, 60, 50};

        // 더 간단하게
        int[] scores2 = {90, 80, 70, 60, 50};
        // 90 -> [0], 80 -> [1]
        // 가장 많이 사용한다.

        // .length -> 몇 개 들어가 있는가?
        System.out.println("첫 번쨰 학생 점수: " +  scores2[0]);
        // 길이 -1의 index 접근시 제일 마지막 칸 접근 가능
        System.out.println("마지막 학생 점수: " + scores2[scores2.length -1]);

        // 배열 선언
        String[] names = {"손흥민", "박지성", "차두리", "차범근", "김민재"};

        // for 문으로 배열 순회
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            // "박지성"을 찾으면, sout("맨유")
            if (names[i].equals("박지성")) {
                System.out.println("맨유");
                System.out.println("박지성이 저장된 칸: " + i);
            }
        }

        // 향상된 for문(for-each)
        // 장점) 가독성이 좋다, 직관적이다. 메모리 주소를 숨긴다.
        // 단점) 인덱스를 직접 찾을 수 없음
        // names 배열에 있는 요소를 처음부터 하나씩 꺼내서
        // name 이라는 변수에 할당
        for (String name: names) {
            System.out.println(name);
            if (name.equals("박지성")) {
                System.out.println("맨유");
            }
        }

    }
}
