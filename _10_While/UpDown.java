package com.study._10_While;

import java.util.Random;
import java.util.Scanner;

public class UpDown {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 1~100 사이 랜점 정수
        int answer = random.nextInt(1, 101);
        // 스캐너로 부터 받아온 숫자를 저장할 변수
        int guess = 0;
        /*
        1. while문 작성!
        2. 랜덤값과 입력값 비교
            - 비교결과 작으면 "up" 출력, 크면 "down" 출력
            - 같으면 "정답입니다: {랜덤값}" 출력하고 반복문 탈출
        break 없이 구현해주세요
        */

        while (answer != guess) {
            System.out.print("1~100 사이 숫자 입력 >> ");
            guess = scanner.nextInt();

            if (answer > guess) {
                System.out.println("\nup!");
            } else if (answer < guess) {
                System.out.println("\ndown!");
            } else {
                System.out.println("\n정답입니다! : " + answer);
            }
        }

    }
}
