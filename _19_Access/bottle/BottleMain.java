package com.study._19_Access.bottle;

public class BottleMain {
    public static void main(String[] args) {
        /*
        Bottle 클래스를 만들어 주세요.
        필드: private int currentWater - 현재 물의 양(ml)
        생성자: currentWater 초기화 생성자(0~1000)
        메서드(public)
        void fill(int amount) {}
        - amount 0보다 커야함, currentWater의 총량이 1000이 넘으면 x
        void drink(int amount) {}
        - (amount 0보다 커야함, 현재 양보다 더 많은양 x), currentWater 음수 x
        getter
        - 현재 물의 양 return
        */

        Bottle bottle = new Bottle(0);
        bottle.drink(100);
        bottle.drink(-100);
        bottle.fill(900);
        bottle.fill(-200);
        bottle.fill(200);

        System.out.println(bottle.getCurrentWater());

    }
}
