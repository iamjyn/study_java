package com.study._20_Static;

public class StaticMethod {
    private int instanceValue; // 인스턴스 변수
    private static int staticValue; // 스태틱 변수

    public static void staticMethod() {
        staticValue++;
        // instanceValue++; // 컴파일 에러! - 인스턴스 변수는 접근 x
        // this에 대한 정보가 없으니까 인스턴스 변수에 접근할 수 없는 것
        // instanceMethod();
        // instanceMethod()가 내부적으로 this를 필요로 하기 때문에 호출 불가능
    }

    public void instanceMethod() {
        // 인스턴스 메서드는 this가 숨겨져 있다.
        // -> this가 없으면 호출할 수 없다.(객체 생성 전엔 호출 불가능)
        instanceValue++; // this의 변수
        staticValue++; // 클래스로 공유하는 변수

        // 프로그램 실행시 static 정보, 클래스 정보들이 메모리에 올라감
        // 인스턴스 메서드는 호출한 객체의 주소인 this가 필요하다
        // 객체가 생성되기 전엔 this 값이 없음
        // 단순히 메모리에 정보가 있다는 것만으로는 호출 불가능

    }





}
