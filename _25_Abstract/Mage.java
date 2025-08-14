package com.study._25_Abstract;

public class Mage extends Character {
    public Mage(String name) {
        super(name, 80, 40);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + "가 " + target.getName() + "에게 파이어볼을 날립니다.");
        target.receiveDamage(attackDamage);
        System.out.println(target.getName() + "가 " + attackDamage + "데미지를 받았습니다.");
    }

}
