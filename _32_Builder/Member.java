package com.study._32_Builder;

public class Member {
    /*
    빌더패턴
    필드가 많을 때(20개 넘어갈 때)
    1. 생성자 오버로딩을 많이 해줘야 함.
    2. 내가 원하는 필드만 초기화 하려면 오버로딩 해줘야 함.
    3. 생성자 시그니처가 겹치는 경우가 많음
    4. 매개변수가 많아서 순서가 헷갈림
    */

    private String name;
    private int age;
    private String email;

    public Member(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    // 정적메서드로 Builder 인스턴스 반환
    public static Builder builder() {
        return new Builder();
    }

    // 바깥클래스의 setter 겸 생성자 역할
    public static class Builder {
        // 바깥클래스의 필드를 똑같이 가진다.
        private String name;
        private int age;
        private String email;

        // 자신의 주소(객체)를 반환 -> 메서드 체이닝
        // Builder.name("홍길동")
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        // Builder.name("홍길동").age(20)
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        // 외부 클래스 타입을 반환
        public Member build() {
            return new Member(this);
        }
    }

}
