package com.study._27_OOP2;

public class Main1 {
    // 특정 클래스 인스턴스 메서드
    public static void processPayment(String paymentType, int amount) {
        if(paymentType.equals("CARD")) {
            System.out.println("카드 결제 처리중..");
            // pg사 api 통신, 승인.. 코드
            // db..
            System.out.println(amount + "원 카드 결제 완료");
        } else if (paymentType.equals("KAKAO_PAY")) {
            System.out.println("카카오페이 결제 처리중..");
            // 카카오 페이 api.. 승인..
            // db..
            System.out.println(amount + "원 카카오페이 결제 완료");
        } else if (paymentType.equals("NAVER_PAY")) {

        }
    }

    public static void main(String[] args) {
        // 다형성: 동일 시그니처 but 다른 동작
        // 인터페이스, 추상클래스 ->
        // 1. 이식/상속시 강제 다형성 구현 가능
        // 2. 추상체를 의존하게끔 설계

        // 소규모 개발시 ? 인터페이스...?
        processPayment("CARD", 20000);




    }
}
