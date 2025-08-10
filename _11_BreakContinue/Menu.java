package com.study._11_BreakContinue;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        // 간단한 ATM 메뉴 구현
        // while문으로 구현 -> break 사용

        // 스캐너
        Scanner scanner = new Scanner(System.in);

        // 잔액
        int balance = 50000;

        while (true) { // 무한 반복 -> break로만 탈출
            // 메뉴 출력
            System.out.println("=== ATM ===");
            System.out.println("1. 잔액확인");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 종료");
            System.out.print("메뉴를 선택하세요(1~4) >> ");

            int choice = scanner.nextInt();
            if (choice == 1) {
                // 조회
                System.out.println("현재잔액: " + balance + "원");
            } else if (choice == 2) {
                // 입금
                System.out.print("입금할 금액을 입력하세요 >> ");
                int money = scanner.nextInt();

                // 음수입력 검증
                if (money > 0) {
                    balance += money;
                    // balance = balance + money;
                    System.out.println(money + "원 입금완료");
                } else {
                    System.out.println("올바름 금액을 입력하세요");
                }
                System.out.println("현재잔액: " + balance + "원\n");
            } else if (choice == 3) {
                // 출금
                // 검증
                // 검증(balance(잔액)보다 작은지)
                // 잔액이 부족 => "잔액이 부족합니다"
                // 음수 -> "올바른 금액을 입력하세요"
                // 출금완료시 -> "출금 완료" 출력

                System.out.print("출금할 금액을 입력하세요 >> ");
                int money = scanner.nextInt();

                // if 얼리리턴(continue) 패턴
                if (money < 0) {
                    System.out.println("올바른 금액을 입력하세요");
                    continue;
                }
                if (money > balance) {
                    System.out.println("잔액이 부족합니다");
                    continue;
                }
                balance -= money;
                System.out.println("출금완료");

                // 기존 방식
//                if (money > 0 && money <= balance) {
//                    balance -= money;
//                    System.out.println(money + "원 출금완료");
//                } else if (money > balance) {
//                    System.out.println("잔액이 부족합니다");
//                } else if (money < 0) {
//                    System.out.println("올바름 금액을 입력하세요");
//                }
//                System.out.println("현재잔액: " + balance + "원\n");
            } else {
                if (choice == 4) {
                    System.out.println("시스템 종료");
                    scanner.close(); // 스캐너 종료
                    break;
                }
            }
        }

    }
}
