package com.study._18_Constructor;

public class ConstructorMain {
    public static void main(String[] args) {
        NoConstructorStudent student = new NoConstructorStudent();
        // 일일이 필드에 직접 접근하여 초기화 시켜줘야 함.
        student.name = "홍길동";
        student.korean = 90;
        student.english = 90;
        student.math = 90;

        // 정의한 생성자 호출
        Student student1 = new Student("홍길동", 90, 90, 90);
        System.out.println(student1.name);

        // 오버로딩한 생성자 호출
        Student student2 = new Student("김길동");
        System.out.println(student2.name);

        // 클래스 내부에 정의된 (인스턴스)메서드를 호출하면
        // this(객체의 주소)를 항상 넘겨주는 구나
        student2.test();
        student1.test();

        System.out.println("-".repeat(50));
        // 두 번째 오버로딩한 생성자 호출
        Student student3 = new Student("최길동", 100);

        // 생성자 정의 안한 것과 똑같음 => 기본생성자
        Student student4 = new Student();

    }
}
