package com.study._02_Variable;

public class DataType {

    public static void main(String[] args) {

        /*
        자료형, (데이터)타입
        초기 프로그래밍에서 메모리 최적화 관점에서 타입을 나눴다.
        현대 프로그래밍 언어에서는 타입 선언을 미리 안 하는 편

        컴퓨터는 모든 데이터를 0과 1로 저장(2진수)
        1bit = 2진수 한 자리 -> 2개 데이터 저장 가능
        2bit = 2진수 두 자리 -> 2^2승
        8bit = 2진수 8자리 -> 2^8승
        32bit = 2진수 32자리 -> 2^32승 = 42억개 데이터 저장 가능
        */

        // 정수(숫자) 타입
        byte smallNum = 127; // 1byte = 8bit -> -128~127
        short mediumNum = 32000; // 2byte
        int normalNum = 20000000; // 4byte = 32bit -> -21억~21억
        long bigNum = 3_000_000_000L; // 8byte

        // 실수 타입(소숫점)
        float smallPrecision = 3.14159265F; // 4byte, 소숫점 7자리 까지 안전
        double highPrecision = 3.14159265; // 8byte, 소숫점 15자리 까지 안전

        // int, long, double 젤 많이 씀

        // 문자(char) 타입(문자 하나를 저장, 작은 따옴표 사용)
        // 아스키코드 (문자에 대응하는 숫자가 있음, 아스키코드 표확인)
        char char1 = 'A'; //작은 따옴표 사용
        char char2 = 65 + 1; // 'A' + 1칸 -> 'B'
        System.out.println(char2);

        // 문자열형 - String(문자들의 집합, 쌍따옴표 사용)
        String greet = "안녕하세요!";
        String name = "홍길동";
        // 문자열끼리 덧셈이 가능하다.
        // 더하게되면 문자열끼리 붙는다.
        System.out.println("greet: " + greet);

        // 논리형 - boolean (true 아니면 false만 저장)
        // 의문형으로 작명해준다.
        boolean isEmpty = true;
        boolean hasError = false;
        }
    }
