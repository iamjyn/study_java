package com.study._20_Static.user;

public class User {
    private String name; // 이름
    private String personalNumber; // 주민번호

    public User(String name, String personalNumber) {
        this.name = name;
        this.personalNumber = personalNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    /*
    static 메서드를 어떻게 활용하면 될까?
    - 인스턴스의 상태(this.으로 참조되는 필드)와 무관해야 함
    - 객체 생성 없이 바로 호출 가능
    => 주로 유틸리티성 메서드로만 쓰이게 된다.

    홍길동, 991010-1234567 > 데이터베이스에서 가져온 평문 데이터
    홍*동, 991010-******* > 마스킹한 데이터로 바꿔줘야 한다.
    */

    public static String getMaskedName(String name) {
        // charAt을 하게 되면 이름이 4글자 이신분은 커버 불가능 -> .substring(2) 부터 끝까지
        String maskedName = name.charAt(0) + "*" + name.substring(2);
        return maskedName;
        //return name.charAt(0) + "*" + name.substring(2);
    }

    public static String getMaskedPersonalNumber(String personalNumber) {
        // 991010-1234567
        // "-" index 찾아서 0~index+1 잘라주고, "*******"
        int dashIndex = personalNumber.indexOf("-");
        String maskedPN = personalNumber.substring(0, dashIndex + 1) + "*".repeat(7);
        return maskedPN;
        // return personalNumber.substring(0, dashIndex + 1) + "*".repeat(7);
    }

    // 스태틱 메서드 정의
    // 매개변수로 User 객체를 받아서, 최종 maskedUser로 리턴해주는 메서드
    // makeMaskedUser

    // 매개변수로 this를 전달해주는 것과 동일
    public static User makeMaskedUser(User user) {
        // 객체의 상태를 조작하면, 새로운 객체로 리턴해주는 게 일반적으로 더 안전하다.
        String maskedName = getMaskedName(user.getName());
        String maskedPN = getMaskedPersonalNumber(user.getPersonalNumber());
        return new User(maskedName, maskedPN);
    }

    // 매개변수로 전달받은 user 객체의 heap 메모리 변환
    // 매개변수로 this를 전달해주는 것과 동일
    public static void applyMaskingUser(User user) {
        String maskedName = getMaskedName(user.getName());
        String maskedPN = getMaskedPersonalNumber(user.getPersonalNumber());
        user.setName(maskedName);
        user.setPersonalNumber(maskedPN);
    }

    // 인스턴스 메서드 정의
    // 매개변수로 maskedUser 객체로 리턴해주는 메서드
    // toMaskedUser

    public User toMaskedUser() {
        String maskedName = getMaskedName(this.name);
        String maskedPN = getMaskedPersonalNumber(this.name);
        return new User(maskedName, maskedPN);
    }

}
