package com.study._28_Object;

import java.util.Objects;

public class ObjectStudent {
    /*
    Object 클래스 - 자바 모든 클래스의 최상위 부모 클래스
    자바에서 명시적으로 다른 클래스를 상속하지 않으면,
    자동으로 Object 클래스를 상속받는다.
    -> Object가 가지고 있는 메서드를 사용가능, 오버라이딩 가능
    */

    private String name;
    private int age;

    public ObjectStudent() {
    }

    public ObjectStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // toString() 메서드
    /*
    sout(): 출력
    sout(객체)
    sout메서드 내부에서 객체가 매개변수로 들어오면
    객체.toString() 호출해서 반환받은 값을 출력한다.

    기존 Object 구현:
    클래스 풀네임 + @ + 16진수로 변환한 메모리주소(알고리즘으로 변환한)

    toString()의 역할:
    객체의 상태(필드) 정보를 문자열로 표현하는 역할

    - 디버깅시 객체 상태 확인
    - 로깅목적
    */

    @Override
    public String toString() {
        return "ObjectStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
    equals()

    동일성(메모리 주소가 같냐) -> Object의 기본 구현
    return (this == obj) // 객체의 heap 주소 비교(stack 값)
    동등성(논리적으로 같냐) -> String이 하나의 구현 예시

    1. 메모리 따질 땐 -> == 연사낮 사용
    2. 논리적으로 따질 땐 -> equals() 오버라이딩 하자

    - 규약 (참고만)
    1. x.equals(x)는 항상 true여야 한다.
    2. x.equals(y)가 true면 y.equals(x)도 true여야 한다.
    3. x.equals(y)가 true면 y.equals(z)도 true면 x.equals(z)도 true여야 한다.
    4. 객체의 상태가 변하지 않는 한, 여러 번 호출해도 결과가 같아야 한다.
    -> 필드를 메서드에 작성할 때, 불변하는 필드만 고려
    5. x.equals(null)은 항상 false를 반환하라.
    */

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        // Object -> ObjectStudent : 다운캐스팅
        ObjectStudent student = (ObjectStudent) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    // hashCode()
    // equals() 구현할 때 반드시 같이 구현해야 함
    // Collections의 Set으로 객체 관리시 중복허용이 안됨.
    // 중복으로 칠건지 말건지들 hashCode()로 결정

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
