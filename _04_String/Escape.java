package com.study._04_String;

public class Escape {
    public static void main(String[] args) {
        // "문자열데이터" ''와 같은 .. 특수기호들을 문자열로 다루고 싶을 때
        // 이스케이프 문자를 써서 문자열로 만들어 준다.
        /*
        \n : 줄바꿈(엔터키)
        \t : 탭(탭키) - 스페이스바 4번
        \" : 큰따옴표 문자열로 취급
        \' : 작은따옴표 문자열로 취급
        \\ : "\"가 문자열로 취급
        */

        System.out.println("hello\nworld\njava");

        // 파일경로 출력 - window 스타일
        // 서버에서 메일보낼 때, 서버에서 화면을 만들어서 보낼 때 주로 사용
        System.out.println("C:\\ProgramFile\\Java");

    }
}
