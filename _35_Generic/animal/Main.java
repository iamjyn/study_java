package com.study._35_Generic.animal;

public class Main {
    public static void main(String[] args) {
        // AnimalHospital<String> 불가능! -> 상한을 Animal로 막아둠

        // Dog, Cat 각 2마리씩 생성
        Dog dog1 = new Dog("멍멍1", 10);
        Dog dog2 = new Dog("멍멍2", 12);

        Cat cat1 = new Cat("야옹1", 7);
        Cat cat2 = new Cat("야옹2", 9);

        // AnimalHospital도 Dog, Cat 타입 두 가지 생성
        AnimalHospital<Dog> dogHospital = new AnimalHospital<>();
        dogHospital.setAnimal(dog1);
        AnimalHospital<Cat> catHospital = new AnimalHospital<>();
        catHospital.setAnimal(cat1);

        // getBiggerOne, checkUp 호출
        dogHospital.checkUp();
        catHospital.checkUp();

        dogHospital.getBiggerOne(dog1, dog2);
        catHospital.getBiggerOne(cat1, cat2);

    }
}
