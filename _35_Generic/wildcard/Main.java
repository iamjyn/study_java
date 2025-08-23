package com.study._35_Generic.wildcard;

import com.study._35_Generic.Box;
import com.study._35_Generic.animal.Animal;
import com.study._35_Generic.animal.AnimalHospital;
import com.study._35_Generic.animal.Dog;

public class Main {
    /*
    와일드 카드
    - 제네릭 타입에서 구체적인 타입대신 '?'를 사용하는 문법
    - 주로 메서드 매개변수에서 사용 됨

    종류
    <?> : 어떤 타입이든 허용하겠다. 다만, 읽기만 가능
    <? extends T> : T의 하위 타입만 허용하겠다. 다만, 읽기만 가능
    <? super T> : T의 상위 타입만 허용하겠다. 쓰기 가능

    제네릭문법은 왜 존재하는가?
    -> 컴파일러에게 업캐스팅/다운캐스팅/다형성 모두 일임하기 위한 문법
    */

    public static void printBox(Box<?> box) {
        box.getData(); // 읽기 가능
        // box.setData("아무데이터"); // 컴파일 오류
        // 매개변수로 받아온 box의 제네릭타입이 명시되지 않는데
        // 런타임에서는 아무런 문제가 되지 않음
        // -> 컴파일러가 오류를 일으키는 것
    }

    // 상한 경계 와일드카드 매개변수
    public static void checkWildCard(AnimalHospital<? extends Animal> hospital) {
        hospital.checkUp(); // 읽기는 가능
        // hospital.setAnimal(new Dog("강아지", 5)); // 쓰기는 불가능
        // Cat인지, Dog인지 보장이 되지 않음
        // 런타임에서는 문제가 되지 않음
        // -> 컴파일러가 오류를 일으키는 것
    }

    // Animal 또는 하위타입(Cat, Dog)을 Box<>에 넣어줄 메서드
    // 하한경계 와일드카드타입 매개변수
    public static void addAnimalToBox(Box<? super Animal> box, Animal animal) {
        box.setData(animal); // 쓰기가 가능
        Object o = box.getData(); // 읽기는 Object 타입으로만 가능하다.
    }

}
