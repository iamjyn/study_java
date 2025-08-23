package com.study._33_Enum;

public enum PaymentMethod {
    /*
    결제 수단별 수수료를 필드로 가지는 Enum을 완성해 주세요
    결제수단: 현금(0퍼), 카드(1퍼), 모바일(2퍼)
    각 결제 수단은 수수료율과 한글 표시명을 가져야 한다.
    결제 금액을 매개변수로 받아 수수료를 계산하는 메서드도 만들어주세요.
    */

    CASH(0, "현금"),
    CARD(1, "카드"),
    MOBILE(2, "모바일");

    private int feeRate;
    private String korName;

    PaymentMethod(int feeRate, String korName) {
        this.feeRate = feeRate;
        this.korName = korName;
    }

    public int calcFee(int price) {
        return price * this.feeRate / 100;
    }


}
