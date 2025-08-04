package com.study._04_String;

public class Email {
    public static void main(String[] args) {
        String email = "student@naver.com";
        // 1. "@" index 찾기
        int atIndex = email.indexOf("@");

        // id만 추출하기
        // 0이상 8미만 잘라서 와라
        // 0이상 "@"라고 적힌 곳 미만으로 잘라서 와라
        System.out.println(email.substring(0, atIndex));

        // naver 인지 아닌지 확인
        boolean isNaver = email.contains("naver");
        System.out.println("네이버입니까? " + isNaver);

        // 도메인(naver.com / daum.net ..)만 떼오기
        String remain = email.substring(atIndex + 1);
        System.out.println(remain);

        // remain - String 자료형 데이터
        // remain을 가지고 naver만 추출해서 출력!
        // "."

        int dotIndex = remain.indexOf(".");
        String naver = remain.substring(0, dotIndex);
        System.out.println(naver);

        // 문제2) 주민번호
        String pn = "990226-1234567";
        // "-" dashIndex를 먼저 구해주세요
        int dashIndex = pn.indexOf("-");

        // 1. 주민번호 앞자리만 추출
        String firstPn = pn.substring(0, dashIndex);
        System.out.println("앞자리: " + firstPn);

        // 2. 생년월일 추출(숫자)
        String birthDate = firstPn.substring(2);
        System.out.println("생일: " + birthDate);

        // 3. 성별코드(뒷자리 첫번째) 추출
        String genderCode = pn.substring(dashIndex + 1, dashIndex + 2);
        System.out.println("성별코드: " + genderCode);

    }
}
