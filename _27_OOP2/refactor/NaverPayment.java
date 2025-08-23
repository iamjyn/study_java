package com.study._27_OOP2.refactor;

public class NaverPayment implements PaymentMethod {
    /*
    필드: email
    amount < 0: 검증
    amount > 0 : {계정(email)}: amount 원 결제 완료
    getPaymentName(): "네이버페이"
    Main에서 테스트 코드 작성
    */

    private String email;

    public NaverPayment(String email) {
        this.email = email;
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("--- 네이버페이 결제 실행 ---");

        if (amount < 0) {
            System.out.println("금액은 음수일 수 없습니다.");
            return false;
        }

        System.out.println(email + ": " + amount + "원 결제 완료");
        return true;
    }

    @Override
    public String getPaymentName() {
        return "네이버페이";
    }
}
