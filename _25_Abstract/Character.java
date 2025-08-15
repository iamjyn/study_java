package com.study._25_Abstract;

public abstract class Character {
    /*
    추상 클래스: 추상 메서드를 하나 이상 포함하는 클래스(abstract 키워드)
    - 객체 생성이 불가능(new로 선언이 불가능)
    Character ch1 = new Warrior("전사") (o) // 업캐스팅
    Character ch2 = new Character("기본캐릭") (x)
    추상 메서드:
    메서드에 시그니처만 작성. 구체적인 구현부가 존재하지 않음.
    추상클래스를 상속받는 클래스는 반드시 추상 메서드를 구현(오버라이딩)해야 한다.(강제)
    */

    protected String name;
    protected int HP;
    protected int attackDamage;

    public Character(String name, int HP, int attackDamage) {
        this.name = name;
        this.HP = HP;
        this.attackDamage = attackDamage;
    }

    // 일반메서드
    public void showStatus() {
        System.out.println(name + ": " + HP);
    }

    public void receiveDamage(int damage) {
        HP -= damage;
        if (HP <= 0) {
            HP = 0;
            System.out.println(name + "이 쓰러졌습니다.");
        }
    }

    // 추상메서드
    // 시그니처만 정의하면 된다. 구현부({})는 상속받는 클래스에 위임(강제)
    public abstract void attack(Character target);

    public String getName() {
        return name;
    }

}
