package com.study._27_OOP2;

import com.study._27_OOP2.refactor.*;

import java.util.Scanner;

public class Main2 {
    private static PaymentMethod getPaymentMethod(String choice, Scanner scanner) {
        // "CARD" -> return new CardPayment();

        switch (choice) {
            case PaymentMethod.CARD_PAYMENT:
                System.out.print("카드 번호를 입력하세요 >> ");
                String cardNum = scanner.nextLine();
                System.out.print("카드에 적힌 이름을 입력하세요 >> ");
                String name = scanner.nextLine();
                return new CardPayment(cardNum, name);
            case PaymentMethod.CASH_PAYMENT:
                return new CashPayment();
            case PaymentMethod.NAVER_PAYMENT:
                System.out.print("네이버 계정(이메일)을 입력하세요 >> ");
                String email = scanner.nextLine();
                return new NaverPayment(email);
        }
        return null;
    }

    public static void main(String[] args) {
        // 외부에서 데이터를 받아온다
        Scanner scanner = new Scanner(System.in);
        System.out.print("어떤 결제 방법으로 결제하시겠습니까? >> ");
        String choice = scanner.nextLine(); // card, cash, naver

        PaymentMethod payment = getPaymentMethod(choice.toUpperCase(), scanner);

        if (payment == null) {
            System.out.println("유효한 결제 방식이 아닙니다.");
            return; // main 메서드 바로 탈출
        }

        // 리턴받은 결제수단 구현체를 PaymentProcessor로 넘겨줘야 함
        PaymentProcessor processor = new PaymentProcessor();

        System.out.print("결제 금액을 입력하세요 > ");
        int amount = scanner.nextInt();

        // 결제 진행
        boolean isSuccess = processor.processPayment(payment, amount);

        if (isSuccess) {
            System.out.println("이용해 주셔서 감사합니다.");
        }

        scanner.close();
    }
}
