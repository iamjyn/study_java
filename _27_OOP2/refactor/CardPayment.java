package com.study._27_OOP2.refactor;

public class CardPayment implements PaymentMethod {
    private String cardNumber;
    private String cardName; // 소유자 이름

    public CardPayment(String cardNumber, String cardName) {
        this.cardNumber = cardNumber;
        this.cardName = cardName;
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("--- 카드결제 실행 ---");
        System.out.println("카드번호: " + cardNumber);
        System.out.println("소유자: " + cardName);

        if (amount < 0) {
            System.out.println("금액은 음수일 수 없습니다.");
            return false;
        }

        return true;
    }

    @Override
    public String getPaymentName() {
        return "신용카드";
    }
}
