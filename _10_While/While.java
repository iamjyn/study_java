package com.study._10_While;

import java.util.Random;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        /*
        while (조건식) {
            // 조건식이 참인 동안 반복될 코드
        }
        // 조건식 결과가 false면 반복 종료
        - for문 적합할 때 : 횟수가 명확한 반복일 때
            -> 데이터베이스에 저장된 데이터(총 100개) 명시되어 있을 때
        - while문 적합할 때 : 횟수가 불명확, 조건 중심일 때
            -> 데이터베이스에 저장된 데이터 중 검색할 때
            -> 조건에 따라 데이터를 가공할 때
        */
        int count = 0;
        while (count < 3) {
            System.out.println("현재 count : " + count);
            count++;
        } // for문에 더 적합함
        System.out.println(count); // 3

        // 랜덤 "객체" "생성"
        Random random = new Random();
        // 스캐너 "객체" "생성"
        Scanner scanner = new Scanner(System.in);

        // 1이상 10미만 중 랜덤 정수를 만들어서 반환
        int num = random.nextInt(1, 10);
        int inputNum = 0; // 스캐너를 통해 숫자를 대입받을 변수
        // 랜덤정수를 맞출 때까지 while문을 반복
        while (num != inputNum) {
            System.out.println("1~9사이 숫자 입력 >> ");
            inputNum = scanner.nextInt();

            if (inputNum == num) {
                System.out.println("정답입니다:" + num);
            } else {
                System.out.println("땡! 다시 입력하세요!");
            }
        }

        // while: (조건확인 -> 중괄호 코드 실행) x N번 -> 조건 false면 탈출

    }
}
