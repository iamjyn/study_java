package com.study._27_OOP2.refactor;

public class CashPayment implements PaymentMethod {
    @Override
    public boolean pay(int amount) {
        System.out.println("--- 현금결제 실행 ---");

        if (amount < 0) {
            System.out.println("금액은 음수일 수 없습니다.");
            return false;
        }

        System.out.println("현금영수증 발행");
        System.out.println(amount + "원 현금결제 완료");
        return true;
    }

    @Override
    public String getPaymentName() {
        return "현금";
    }
}
