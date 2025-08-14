package com.study._22_OOP;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("홍길동", 1);
        Student s2 = new Student("김길동", 1);
        Student s3 = new Student("박길동", 1);

        School school = new School("자바 대학교");

        // 학생 -> 학교 메모리에서 연결
        s1.setSchool(school);
        s2.setSchool(school);
        s3.setSchool(school);

        // 학교 -> 학생 메모리에서 연결
        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);

        // s1.printInfo();
        school.printAllStudents();

    }
}
