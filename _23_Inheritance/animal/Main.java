package com.study._23_Inheritance.animal;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println(cat1.name);
        System.out.println(cat1.age);

        Cat cat2 =new Cat("나비", 5, "블랙");
        cat2.showInfo();
        cat2.eat();

    }
}
