package com.study._23_Inheritance.animal;

public class Cat extends Animal {
    private String color;

    public Cat() {
        this.color = "회색";
    }

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("고양이가 사료를 먹습니다");
    }

    @Override
    public void showInfo() {
        System.out.println("이름: " + this.name);
        System.out.println("나이: " + this.age + "살");
        System.out.println("털색: " + this.color);
    }

    public void meow() {
        System.out.println(this.name + "가 야옹하고 웁니다.");
    }

}
