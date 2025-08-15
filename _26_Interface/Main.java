package com.study._26_Interface;

public class Main {
    public static void main(String[] args) {
        /*
        인터페이스: 자바에서 구현할 수 있는 최상위 추상 레벨
        1. 필드가 없음(상수는 가능) -> 상수는 static 선언을 함 > heap이 아니라 메서드 영역에 저장됨
        -> 상태가 없음
        -> heap 메모리 존재하지 않음(메서드 영역에만 메모리 존재)**
        2. 모든 메서드가 추상메서드(메서드 시그니처만 존재)
        -> "~한 기능을 가집니다"라는 명세만 존재
        추상클래스: is-a 관계 Archer is a Character
        인터페이스: can-do 관계 Archer can do drawBow
        3. 다중 상속이 가능(heap이 없어서 가능함)
        -> 다중 상속 시 발생하는 문제(어떤 부모의 필드/생성자) 가져와야 하나? 없음
        
        클래스: 구현체
        추상클래스: 구현체 ~ 추상체(중간지대)
        인터페이스: 추상체

        그럼에도 추상클래스가 계속해서 쓰이는 이유
        => 공통 상태(필드)가 필요해서
        */

        Dog dog = new Dog();
        Duck duck = new Duck();

        Animal[] animals = {dog, duck}; // (사이드) 캐스팅
        Swimmable[] swimmables = {dog, duck}; // (사이드) 캐스팅

        AnimalManager manager = new AnimalManager();
        manager.testSwimming(duck);
        manager.testSwimming(dog);
        // 컴파일러 입장: duck과 dog를 Swimmable 타입으로 생각 -> ok
        // JVM 입장: 실제 객체(new) 기준으로 메서드 호출(오버라이딩된 메서드기 실행 됨)
        // 런타임에 실제 객체(new) 기준으로 메서드 호출 -> 동적바인딩

    }
}
