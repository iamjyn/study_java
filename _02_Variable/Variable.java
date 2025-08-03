package com.study._02_Variable;

public class Variable {
    public static void main(String[] args) {
        // 변수
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");

        // 변수 쓰는 이유
        // "hello" -> "world!" 변경 -> 노가다

        // 자료형 변수이름
        String greeting; // 변수 선언(빈 박스를 만들었다)
        greeting = "hello"; // 변수 초기화(빈 박스에 데이터 넣기)
        System.out.println(greeting); // 변수에 저장된 값을 꺼내서 사용
        greeting = "world!"; // 변수에 데이터 재할당(데이터 바꾸기)
        System.out.println(greeting);

        // 한번에 변수(academy) 선언 및 초기화(데이터를 넣음)
        String academy = "korea IT";

        // "같은 자료형" 변수 여러 개 선언
        String city, name;
        city = "부산"; // 초기화
        name = "이름"; // 초기화

        // "같은 자료형" 한줄에 여러변수 선언 및 초기화
        String dogHello = "멍멍", catHello = "야옹";

        /*
        명명법
        1. 필수규칙
            String 1name // 숫자로는 시작 불가능
            String my name // 변수에는 띄어쓰기 불가능
            String class // 자바 예약어 사용 불가능
            String if // 자바 예약어(if 문법)

            * 예약어 : 자바에서 이미 문법으로 지정한 키워드

        2. 관례
            파스칼 표기법 => "last name" => LastName : 클래스명, 파일명
            ex) class Student
            카멜 표기법 => "last name" => lastName : 변수명, 메서드(함수)
            ex) String studentName, String studentAge

        3. 매너
            의미가 명확한 작명을 하자(길어도 상관없음)
            ex) int numberOfItemsCurrentlyInShoppingCart
            현재 쇼핑카트에 담긴 물품 갯수
            ex) numOfItemCISC 자기만 아는 변수이름 (x)
            학습중이니까 나만 아는 변수 OK
            프로젝트(협업)시 반드시 의미가 명확한 변수명 권장
        */
    }
}
