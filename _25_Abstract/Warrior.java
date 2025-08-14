package com.study._25_Abstract;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name, 120, 25);
    }

    // 파라미터로 구현체가 아니라, 추상체를 받고 있음
    // -> 구체적인 클래스와 무관하게 설계 가능
    // == 구체적인 클래스에 의존하지 않는다.**
    @Override
    public void attack(Character target) {
        System.out.println(name + "가 " + target.getName() + "에게 강력하게 때립니다.");
        target.receiveDamage(attackDamage);
        System.out.println(target.getName() + "가 " + attackDamage + "데미지를 받았습니다.");
    }

    // 추상체: 추상클래스, 인터페이스
    // 구현체: 추상클래스, 인터페이스를 상속/이식 받아서 오버라이드 구현을 한 객체
    // 일반화 -> 구현체는 추상체로 업캐스팅이 가능하다
    // 구현체는 상속/이식 받은 추상체의 메모리부분을 다 가지고 있기 때문
    // 의사(추상체), 구현체(내과의, 외과의..) -> 내과의와 외과의는 의사역할 가능!

}
