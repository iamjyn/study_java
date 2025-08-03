package com.study._04_String;

public class StringMethod {
    public static void main(String[] args) {
        // 자료형 - 원시자료형(첫글자 소문자 int, long, ..) / 참조자료형(String)
        // 문자열(String) 참조자료형 -> "." 으로 참조할 수 있다.
        // 문자열 관련 유틸 메소드(함수)

        String str = "My name is Son";

        // 문자열 길이(문자 몇개?)확인: .length() ***

        System.out.println("문자열 길이: " + str.length());

        // 대소문자 변환 -> 사용자 입력을 대문자로 통일해서 받겠다.
        System.out.println("대문자: " + str.toUpperCase());
        System.out.println("대문자: " + str.toLowerCase());

        // 특정 문자열 포함여부(있나 없나) - boolean 으로 반환
        System.out.println("name이 문자열에 있나? " + str.contains("name"));
        System.out.println("age이 문자열에 있나? " + str.contains("age"));

        // 특정 문자열의 위치(index) 찾기 -> int(숫자) 반환 **
        System.out.println("Son의 index: " + str.indexOf("Son")); // 11
        System.out.println("java의 index: " + str.indexOf("java")); // 찾는 index가 없는 경우 '-1' 반환

        // 문자열의 시작(접두) / 끝(접미) 확인 -> boolean 으로 반환
        System.out.println("My로 시작하는가? " + str.startsWith("My"));
        System.out.println("Son로 끝나는가? " + str.endsWith("Son"));

        // 문자열 교체하기
        System.out.println(str.replace("Son", "son"));

        // 문자열 추출(자르기)하기
        System.out.println(str.substring(8)); // index 8부터 끝까지 자르겠다
        System.out.println(str.substring(8, 10)); // index 8이상 10미만으로 자르겠다

        int indexOfSon = str.indexOf("Son"); // 시작 index를 가져옴
        System.out.println(indexOfSon); // 문자열을 바꿔주면 변함
        System.out.println(str.substring(indexOfSon));

    }
}
