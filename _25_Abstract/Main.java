package com.study._25_Abstract;

public class Main {
    public static void main(String[] args) {
        // 추상클래스는 직접 인스턴스 생성이 불가능하다.
        // Character ch = new Character();
        // 구현체 인스턴스가 업캐스팅된 형태로는 생성 가능
        Character wr = new Warrior("테스트 전사");

        Warrior warrior = new Warrior("타락파워전사");
        Mage mage = new Mage("썬콜법사");
        Archer archer = new Archer("궁수");

        // 부모(추상클래스)가 가지고 있던 일반메서드
        warrior.showStatus();
        mage.showStatus();

        // 같은 attack() 메서드이지만, 다른 동작 => 다형성이 구현 됨
        // 추상클래스(추상메서드)는 문법적으로 다형성을 강제하도록 설계되어 있다.
        warrior.attack(mage);
        mage.attack(warrior);

        /*
        객체 지향 설계 5원칙(SOLID)
        2. OCP(Open Closed Principle) - 개방폐쇄원칙
        확장에는 열려있고, 수정에는 닫혀 있어야 한다.
        -> 새로운 기능이 추가될 때는, 기존코드는 간섭받지 않아야 한다.
        */

        System.out.println("-".repeat(30));
        archer.attack(warrior);
        warrior.attack(archer);
        // 컴파일러: 업캐스팅한거구나..ok
        // JVM: archer의 오버라이딩한 attack을 호출

        System.out.println("-".repeat(30));
        archer.showStatus();
        warrior.showStatus();

    }
}
