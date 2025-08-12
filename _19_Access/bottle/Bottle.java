package com.study._19_Access.bottle;

public class Bottle {
    /*
    Bottle 클래스를 만들어 주세요.
    필드: private int currentWater - 현재 물의 양(ml)
    생성자: currentWater 초기화 생성자(0~1000)
    메서드(public)
    public void fill(int amount) {}
    - amount 0보다 커야함, currentWater의 총량이 1000이 넘으면 x
    public void drink(int amount) {}
    - (amount 0보다 커야함, 현재 양보다 더 많은양 x), currentWater 음수 x
    getter
    - 현재 물의 양 return
    */

    private int currentWater;

    public Bottle(int currentWater) {
        if (currentWater > 1000) {
            this.currentWater = 1000;
        } else if (currentWater < 0) {
            this.currentWater = 0;
        } else {
            this.currentWater = currentWater;
        }
    }

    // amount 0보다 커야함, currentWater의 총량이 1000이 넘으면 x
    public void fill(int amount) {
        if (amount > 0 && currentWater + amount <= 1000) {
            currentWater += amount;
            System.out.println("현재 물의 양: " + currentWater);
        } else {
            System.out.println("잘못된 amount 입력입니다.");
        }
    }

    // (amount 0보다 커야함, 현재 양보다 더 많은양 x), currentWater 음수 x
    public void drink(int amount) {
        if (amount > 0 && amount < currentWater) {
            currentWater -= amount;
            System.out.println("현재 물의 양: " + currentWater);
        } else {
            System.out.println("잘못된 amount 입력입니다.");
        }
    }

    public int getCurrentWater() {
        return this.currentWater;
    }

    public void setCurrentWater(int currentWater) {
        if (currentWater > 1000) {
            this.currentWater = 1000;
        } else if (currentWater < 0) {
            this.currentWater = 0;
        } else {
            this.currentWater = currentWater;
        }
    }

}
