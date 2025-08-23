package com.study._35_Generic.animal;

public class AnimalHospital<T extends Animal> {
    /*
    <T extends Animal>: 타입 매개변수(T) 상한 경계
    - T는 Animal 타입이거나, Animal을 상속받는 타입이어야 한다.
    - Animal의 메서드를 사용할 수 있다. -> 다형성을 지킬 수 있음

    - AnimalHospital<Cat>
    - 컴파일러 입장: Cat 타입이 있나 검사(Animal을 상속 받았나?)
    - JVM 입장: Animal로 보임
    */

    private T animal;

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public T getBiggerOne(T animal1, T animal2) {
        // 상한 경계를 막아서 얻을 수 있는 이득(getSize()가 공통으로 선언되어 있음)
        return animal1.getSize() > animal2.getSize() ? animal1 : animal2;
    }

    public void checkUp() {
        // 다형성을 지킬 수 있음
        animal.sound();
    }


}
