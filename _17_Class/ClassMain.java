package com.study._17_Class;

public class ClassMain {
    public static void main(String[] args) {
        /*
        클래스 -> 새로운 나만의 참조 자료형을 정의한 것
        학생 + 학생의 점수(국,영,수) -> 한셋트로 관리하고 싶음
        데이터 셋트를 정의해 주는 것이 클래스
        */

        // Student 타입 변수 선언 -> stack에 student 라는 변수 자리를 만들었다.
        // 연결된 heap 주소가 없으니 저장하고 있는 값은 null
        Student student;
        // new 연산을 하는 순간 heap에 빈 메모리공간(객체, 인스턴스) (String 1개, int 3개) 생성
        // heap 주소를 student에 대입 -> stack과 heap이 연결됨
        student = new Student();

        // student: heap의 주소(0x0010)
        // student.name -> 0x0010에 있는 name 자리
        // student.name = "홍길동" -> 0x0010의 name자리에 "홍길동" 데이터를 저장하겠다.

        student.name = "홍길동";
        student.korean = 90;
        student.english = 90;
        student.math = 90;
        // heap주소를 찾아가서 직접 메모리에 값을 넣어줌

        /*
        --stack(main)--
        student: null(주소없음) -> 0x1000(new로 생성하여 대입)

        heap
        0x1000 : Student 객체 정보
        0x1010 : 홍길동 문자열 주소
        0x1014 : korean = 90
        0x1018 : english = 90
        0x1022 : math = 90
        student.korean -> heap에 있는 0x1014 주소로 가보세요
        student.english -> heap에 있는 0x1018 주소로 가보세요
        student.math -> heap에 있는 0x1022 주소로 가보세요
        */

        // null이란?
        // 참조형 변수가 아무런 객체와도 연결되지 않은 상태(주소값이 없는 상태)
        // 객체와 인스턴스: 객체와 인스턴스는 같은 말이다.

        /*
        student는 객체다(o)
        - 인스턴스: 실제 프로그램 구동시에 생성된 객체(관점2)
        student는 인스턴스다(o)
        - 인스턴스: 특정 클래스의 소속임을 명확히 해주는 용어(관점1)
        student는 Student 클래스의 인스턴스다(o)
        student는 Student 클래스로 부터 만들어진 객체다(o)

        Student는 객체다(x) -> Student는 클래스이다(o)
        */

    }
}
