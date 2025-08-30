package com.study._32_Builder;

public class Main {
    public static void main(String[] args) {
        Member member = Member.builder()
                .email("java@naver.com")
                .age(20)
                .name("홍길동")
                .build();

        LombokMember member1
                = new LombokMember("홍길동", 20, "java@gmail.com");
        System.out.println(member1);

        LombokMember member2 = LombokMember.builder()
                .age(20)
                .email("java@lombok.com")
                .name("김길동")
                .build();
    }
}
