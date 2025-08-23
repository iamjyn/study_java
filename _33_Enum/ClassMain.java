package com.study._33_Enum;

public class ClassMain {
    // 등급별 할인율을 반영하여 최종 가격을 리턴하는 함수
    public static int discount(int price, ClassGrade classGrade) {
        // 매개변수로 값(상수)이 아니라, 객체(상수)를 받아온다.

        int discountPercent = 0;

        if (classGrade == ClassGrade.BASIC) {
            discountPercent = ClassGrade.BASIC.getDiscountPercent(); // 10
        } else if (classGrade == ClassGrade.GOLD) {
            discountPercent = ClassGrade.GOLD.getDiscountPercent(); // 20
        } else if (classGrade == ClassGrade.DIAMOND) {
            discountPercent = ClassGrade.DIAMOND.getDiscountPercent(); // 30
        } else {
            System.out.println("할인 적용 없음");
            return price;
        }
        return price * discountPercent / 100;
    }

    public static void main(String[] args) {
        int price = 100000;

        int basic = discount(10000, ClassGrade.BASIC);
        int gold = discount(10000, ClassGrade.GOLD);
        int diamond = discount(10000, ClassGrade.DIAMOND);

        // discount 함수가 클래스 ClassGrade 객체를 매개변수로 받게 됨
        // -> 이전 상수도입과는 다르게,
        // discount(price, "VVIP")같은 매직스트링을 강제로 방지할 수 있다.(컴파일 시점에)
        // ClassGrade myGrade = new ClassGrade(); 생성자를 private로 막아놔서
        // 미리 선언 해놓은 인스턴스만 사용가능(타입 안정)
    }
}
