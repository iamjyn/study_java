package com.study._23_Inheritance.animal;

// 부모클래스
public class Animal {
    protected String name;
    protected int age;

    public Animal() {
        this.name = "이름없음";
        this.age = 0;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getOld() {
        System.out.println(name + "이 한살 나이를 먹습니다.");
        this.age++;
    }

    public void eat() {
        System.out.println("밥을 먹습니다.");
    }

    public void showInfo() {
        System.out.println("이름: " + this.name);
        System.out.println("나이: " + this.age + "살");
    }

    /*
    1. Cat 클래스 - Animal 상속
    2. private 필드 color
    3. 생성자 기본생성자 color(회색)
    4. 메서드 오버라이딩
    eat: "고양이가 사료를 먹습니다" 출력
    showInfo: 이름, 나이, 털색
    5. 고유메서드
    void meow -> {name}가 야옹하고 웁니다.
    */

}
