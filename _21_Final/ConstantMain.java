package com.study._21_Final;

public class ConstantMain {
    public static void main(String[] args) {
        System.out.println("게임명: " + Constant.GAME_NAME);
        System.out.println("게임모드: " + Constant.BATTLE_MODE);

        int playerLevel = 18;
        int tempPlayerLevel = playerLevel;

        if (++tempPlayerLevel > Constant.MAX_LEVEL) {
            System.out.println("최대 레벨에 이미 도달 하였습니다.");
        } else {
            playerLevel = ++tempPlayerLevel;
            // 전위증가: 대입되기 전에 1증가하고 대입
            // 후위증가: 대입먼저 하고 1증가
        }

        int price = 100000; // 사용자가 입력한 값
        double totalPrice;

        // 매직넘버들을 상수화하여서 리팩토링 해주세요
//        if (price >= 50000) {
//            double discountPrice = price * 0.1;
//            totalPrice = price - discountPrice;
//        }

        if (price >= Constant.DISCOUNT_THRESHOLD) {
            double discountPrice = price * Constant.DISCOUNT_RATE;
            totalPrice = price - discountPrice;
        }

        // 매직넘버, 매직스트링
        // 나중에 코드를 내가 봤을 때, "이 숫자, 이 문자열은 무슨 의미지?" 궁금해지면
        // 매직넘버, 매직스트링이다.

    }
}
