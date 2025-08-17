package com.study._27_OOP2.refactor;

public interface PaymentMethod {
    // 인터페이스에는 필드로 상수만 선언 가능
    // public static final 생략가능
    String CARD_PAYMENT = "CARD";
    String CASH_PAYMENT = "CASH";

    // 결제 성공시 true, 실패시 false
    // null 체크, 입력갑 검증 제외
    boolean pay(int amount);

    // getter 강제
    String getPaymentName();

}
