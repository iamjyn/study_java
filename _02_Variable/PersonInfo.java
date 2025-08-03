package com.study._02_Variable;

public class PersonInfo {
    public static void main(String[] args) {

    // 홍길동의 개인정보가 주어지면
    // 적절한 변수타입으로 저장하여
    // 최종 출력해주세요
    /*
    이름 : 홍길동
    태어난 년도 : 2000년
    키 = 175.8
    혈액형 = A
    학생여부 = 학생 아님

    //최종 출력
    이름: 홍길동
    태어난년도: 2000년
    키: 175.8
    혈액형: A
    학생여부: false
     */

        // '='은 같다라는 의미가 아님
        // 오른쪽 데이터를 왼쪽 변수에 대입한다.
        String name = "홍길동";
        int year = 2000;
        double height = 175.8;
        char bloodType = 'A';
        boolean isStudent = false;

        System.out.println("이름: " + name);
        System.out.println("태어난년도: " + year + "년");
        System.out.println("키: " + height);
        System.out.println("혈액형: " + bloodType);
        System.out.println("학생여부: " + isStudent);
    }
}
