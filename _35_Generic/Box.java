package com.study._35_Generic;

// 제네릭 클래스
// 클래스이름<T> 타입 매개변수를 선언 -> T를 클래스 내부에서 실제 타입처럼 사용
public class Box<T> {

    // Box.java(자바-영어) -> 컴파일러가 번역(컴파일 에러) -> Box.class(기계어-숫자)
    // Box.class -> JVM 읽고 OS에게 명령하고 작동(런타임, 런타임 에러) -> 프로그램 종료

    // Object 타입으로 선언된 필드에는 참조자료형이면 무엇이든지 set 가능
    // private Object data;

    // Object 처럼 모든 데이터를 담을 수 있음 - 원시자료형 제외
    private T data;

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
