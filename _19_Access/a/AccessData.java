package com.study._19_Access.a;

public class AccessData {
    /*
    접근제한자: 접근을 외부로부터 제한하는 제어자
    클래스, 메서드, 필드에 정의할 수 있음

    -> 접근제한자 종류
    1. public
    - 가장 개방적, 어디서든 접근/직접참조(".") 가능
    - 외부에 완전히 공개되는 자료에 사용

    2. protected(나중에 쓰임)
    - 같은 패키지 내부 && 상속 관계일 때만 접근 가능
    - 상속구조에서 일부만 공개되는 자료에 사용

    3. default
    - 같은 패키지 내부에서만 접근 가능
    - 접근제한자를 정의하지 않으면(생략하면) 기본값으로 default 정의됨
    - 패키지 내부 구현끼리 공유해서 사용되는 자료

    4. private
    - 가장 제한적, 자기 자신 클래스 내부에서만 접근 가능하다.
    - 외부에서 완전히 접근하지 못하도록 숨기기 위해

    -> 사용하는 이유
    : 데이터를 안전하게 보호하기 위해(외부로부터 오염되지 않게 하기 위함)
    */

    // 필드
    public int publicField; // 모든 곳에서 접근 가능
    int defaultField; // 같은 패키지만 접근 가능
    private int privateField; // AccessData 클래스 안에서만 접근 가능

    // 메서드
    public void publicMethod() {
        System.out.println("퍼블릭 메소드 호출");
    }

    void defaultMethod() {
        System.out.println("디폴트 메소드 호출");
    }

    /*
    AccessData data = new AcessData();
    data.privateMethod() (사용x)
    -> 클래스 내부에서 코드를 재사용할 때
    */
    private void privateMethod() {
        System.out.println("프라이빗 메소드 호출");
    }

    public void innerAccess(int number) {
        privateMethod(); // private -> 같은 클래스 내부에서만 호출 가능
        this.privateField = number;
        System.out.println("프라이빗 필드 값: " + privateField);

    }

}
