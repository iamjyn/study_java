package com.study._22_OOP;

public class School {
    private String name; // 학교이름
    private Student[] students; // 학교에 재학중인 학생들

    // School은 student 여러 개를 알고 있다
    // => 학교:학생 => 1:N 관계
    /*
    객체 간 관계
    1:1 관계 - 필드 선언이 서로 1:1로 대응될 때
    1:N 관계 - 필드 선언이 서로 1:N으로 대응될 때
    M:N 관계 - 필드 선언이 서로 M:N으로 대응될 때
    */

    private int studentCount; // 현재 등록된 학생 수
    private static final int MAX_STUDENTS = 10; // 최대 정원 수

    public School(String name) {
        this.name = name;
        this.students = new Student[MAX_STUDENTS];
        this.studentCount = 0; // 처음에는 학생이 없다!
    }

    // 학생을 등록하는 코드
    public void addStudent(Student student) {
        // 현재 TO가 있는지 검사
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("현재 정원이 꽉 참. 더이상 등록 불가능합니다.");
            return;
        }

        // 배열의 빈 자리에 학생을 추가
        // 학교가 -> 학생을 등록(o), 학교가 학생을 알게 됨, 서로가 연관 됨
        this.students[studentCount] = student;
        // 학생 수 증가 -> 다음 빈자리 위치(index)를 studentCount로 갱신
        this.studentCount++;
    }
    // 학생이 -> 학교를 등록(x) 관련 코드는 작성하지 않는다!
    // student.setSchool(this) (x)
        /*
        School은 단순히 학생 목록만 관리
        학생의 상태(school 필드)는 School의 입장에선 알 바가 아니다(책임 권한이 없다)

        객체 지향 설계 5원칙(SOLID)
        1. SRP(Single Responsibility Principle) - 단일책임원리
        : 각 클래스는 하나의 "책임"만 수행하도록 설계하라
        *책임: 개발자의 주관적 기준
        */

    public String getName() {
        return name;
    }

    // 특정 인덱스의 학생객체를 반환하는 메서드
    // 배열에 직접 접근하는 걸 막기 위해서, 메서드로 우회해서 가져가도록 (배열 주소를 노출하지 않기 위해서)
    public Student getStudent(int index) {
        if (index >= 0 && index < this.studentCount) {
            return students[index];
        }
        return null; // 잘못된 index면 null 반환
    }

    // 재학생들 명단 출력코드
    public void printAllStudents() {
        System.out.println("[" + this.name + "]" + " 재학생 목록");
        if (this.studentCount == 0) {
            System.out.println("재학생이 없습니다.");
        } else {
            // 반복문을 출력
            for (int i = 0; i < this.studentCount; i++) {
                this.students[i].printInfo();
            }
        }
    }

}
