package com.study._20_Static;

public class StaticData {
    // static -> 스태틱(클래스) 변수(필드)
    // static x -> 인스턴스(객체) 변수

    /*
    JVM 메모리 = stack + heap + method area(메서드 영역)..

    method area(메서드 영역)
    - 클래스의 정보를 저장하는 메모리 영역
    - 클래스의 정보(메서드 정보 + static 변수 정보)
    - 메서드 정보들이 저장되어 있기 때문에 객체가 메서드를 호출하면,
      this(현재 객체의 상태)를 전달해서 작동

    - 클래스정보가 메모리에 올라가는 시점 : 프로그램 실행 시
    - 객체가 메모리에 올라가는 시점: new 연산 시
    */

    // static 변수 (클래스 변수) : 메서드 영역에 저장
    // 모든 인스턴스가 공유하는 변수다
    // StaticData 클래스로 부터 생성된 모든 인스턴스가 같은 값(주소)을 본다.
    public static int instanceCount;

    // 인스턴스 변수: 각 인스턴스마다 별도로 존재(heap에 존재)
    // 인스턴스마다 개별 값을 가지기 때문에 공유되지 않음
    public int count;
    public int id;

    public StaticData(int id) {
        // static 변수 -> StaticData로 부터 생성된 인스턴스의 총 수를 누적 기록
        instanceCount++; // this 없음

        // 인스턴스 변수 -> 각 인스턴스에서만 영향을 받는다.
        this.count++;

        this.id = id;
    }
}
