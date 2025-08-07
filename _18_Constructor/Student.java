package com.study._18_Constructor;

public class Student {
    String name;
    int kor;
    int eng;
    int math;

    // 생성자
    // new로 객체를 만들 때 호출되는 메서드 비슷한 것. (메서드는 아님)
    /*
    1. 클래스 이름과 동일해야 한다.
    2. 반환타입 x, static x -> 메서드가 아니기 때문에
    3. 객체를 생성시(new) 자동으로 호출
    4. 객체 생성/초기화 담당
    */
    public Student(String name, int kor, int eng, int math) {
        System.out.println("생성자 호출 됨!");
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        /*
        // this
        this는 객체 자기 자신을 가르키는 주소값(heap 주소)
        Student student1 = new Student()
        student1 -> heap 주소가 저장됨(0x0010)
        0x0010 -> this 라는 변수로 대입되어서 전달

        student1.name = "홍길동"
        sout(this.name) -> "홍길동"이 콘솔에 출력됨
        this -> 호출한 객체 자기 자신의 주소값

        */
    }

    // 생성자도 오버로딩이 가능하다
    public Student(String name) {
        System.out.println("이름만 초기화하는 생성자 호출!");
        this.name = name;
    }

    void test() {
        System.out.println("this의 이름 확인: " + this.name);
    }

    // 이름과 국어점수만 초기화하는 생성자 - 오버로딩
    public Student(String name, int kor) {
        this(name, kor, 0, 0);

        // this() != this. 아예 상관이 없는 문법
        // this() : 같은 이름의 생성자 (오버로딩 된) 호출
        // Student(String name, int kor, int english, int math)
        // this() : 제약사항: 생성자의 가장 첫 줄에 적어 줘야한다.

        System.out.println("이름, 국어점수 생성자 호출!");
    }

    public Student() {

    }



}
