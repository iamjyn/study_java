package com.study._35_Generic;

public class BoxMain {
    public static void main(String[] args) {
        /*
        제네릭이란?
        - 클래스나 메서드에서 사용할 자료형(타입)을 미리 선언하지 않고,
        사용할 때(호출, 생성하는 쪽) 결정하는 문법
        - <T>, <K, V> 등의 타입 매개변수를 사용

        용어 정리
        - 타입 매개변수(파라미터): <T>의 T를 의미함
        - 타입 인자: <String> String을 타입인자라고 부른다.
        */

        // String 타입 Box로 쓰겠다
        // instanceof를 쓴 것과 결과가 동일
        Box<String> stringBox = new Box<>("문자열데이터");

        String myStr = stringBox.getData(); // 다운캐스팅을 안해줘도 된다!
        System.out.println(myStr);
        /*
        제네릭타입 -> 결국 Object로 컴파일 됨.
        컴파일러가 알아서 타입검사/업캐스팅/다운캐스팅 해준다!
        -> 결국 런타임에서는 Object 취급
        : 따라서 원시자료형은 객체가 아니므로 제네릭타입으로 사용할 수 없다.
        */

        Box<Integer> integerBox = new Box<>(100);
        // 다운캐스팅, 언박싱 둘다 컴파일러가 알아서 해 준 것.
        int num = integerBox.getData();
        System.out.println(num);

    }
}
