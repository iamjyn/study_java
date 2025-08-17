package com.study._27_OOP2.refactor;

public class PaymentProcessor {
    // 역할: PaymentMethod 이식받은 객체들을 받아서 결제 동작 시켜주는 "중매" 역할
    // PaymentMethod 인터페이스만 의존

    public boolean processPayment(PaymentMethod paymentMethod, int amount) {
        System.out.println("-- 결제 시작 --");

        if (paymentMethod == null) {
            System.out.println("유효한 결제 수단이 아닙니다.");
            return false;
        }

        // 로깅 -> db에 저장
        System.out.println("결제수단: " + paymentMethod.getPaymentName());
        System.out.println("결제금액: " + amount + "원");

        // 다형성 구현
        boolean isSuccess = paymentMethod.pay(amount);

        if (isSuccess) {
            System.out.println("결제가 성공적으로 완료 되었습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }

        return isSuccess;

    }
}
