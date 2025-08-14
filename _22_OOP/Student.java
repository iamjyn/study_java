package com.study._22_OOP;

public class Student {
    // School 객체, Student 객체
    // 두 객체간 관계에 관한 코드(상호작용)를 작성

    private String name; // 이름
    private int grade; // 학년
    private School school; // 학생 객체가 다니는 학교
    // 학생:학교 => N:1 관계

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // setter를 통해 학생이 학교를 알게 됨
    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    // 참조가 되기 전엔 null이 반환 됨.
    public School getSchool() {
        return school;
    }

    // 학생 정보 소개 코드
    public void printInfo() {
        System.out.println("이름: " + this.name);
        System.out.println("학년: " + this.grade);
        // 객체가 있는 경우 null 체크 필수!
        String schoolName = this.school == null ? "없음" : school.getName();
        System.out.println("학교: " + schoolName);
    }

}
