package com.study._23_Inheritance;

public class Main {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        ElectricCar EV6 = new ElectricCar("기아");
        tesla.move(); // 부모의 메서드 호출 가능
        EV6.openDoor(); // 부모의 메서드 호출 가능

        System.out.println("-".repeat(30));
        GasCar gasCar = new GasCar("현대");
        gasCar.move(); // 오버라이딩 호출
        gasCar.fillGas();

    }
}
