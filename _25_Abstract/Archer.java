package com.study._25_Abstract;

public class Archer extends Character{
    /*
    생성자
    attack
    main에 테스트 코드 -> HP상태 확인
    */

    public Archer(String name) {
        super(name, 100, 25);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + "가 " + target.getName() + "에게 화살을 날립니다.");
        target.receiveDamage(attackDamage);
        System.out.println(target.getName() + "가 " + attackDamage + "데미지를 받았습니다.");
    }

}
