package com.study._19_Access.bottle;

public class Bottle {
    private int currentWater;

    // 생성자
    public Bottle (int currentWater) {
        if (currentWater > 1000) {
            currentWater = 1000;
        } else if (currentWater < 0) {
            currentWater = 0;
        } else {
            currentWater = currentWater;
        }
    }

    public void fill(int amount) {
        if (amount > 0 && currentWater + amount <= 1000) {
            currentWater += amount;
            showAmount();
        } else {
            System.out.println("잘못된 amount 입력입니다.");
        }
    }

    public void drink(int amount) {
        if (amount > 0 && amount <= currentWater) {
            currentWater -= amount;
            showAmount();
        } else {
            System.out.println("잘못된 amount 입력입니다.");
        }
    }

    private void showAmount() {
        System.out.println("현재 물의 양: " + currentWater + "\n");
    }

    // private 값을 조회
    public int getCurrentWater() {
        return this.currentWater;
    }

}
