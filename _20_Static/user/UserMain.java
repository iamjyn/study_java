package com.study._20_Static.user;

public class UserMain {
    public static void main(String[] args) {
        // 데이터 베이스에서 가져온 평문 데이터
        User user = new User("홍길동", "991010-1234567");
        System.out.println(user.getName()); // 평문
        System.out.println(user.getPersonalNumber()); // 평문

        System.out.println(User.getMaskedName(user.getName())); // 마스킹 이름
        System.out.println(User.getMaskedPersonalNumber(user.getPersonalNumber())); // 마스킹 주민번호

        System.out.println("-".repeat(30));

        // -> 화면에 보여질 User로 바꿔주자
        String name = User.getMaskedName(user.getName());
        String pn = User.getMaskedPersonalNumber(user.getPersonalNumber());
        System.out.println(name);
        System.out.println(pn);
        User maskedUser = new User(name, pn);
        // maskedUser를 화면에 보여주면 된다.

        User user2 = User.makeMaskedUser(user);
        System.out.println(user == user2);

//        System.out.println(user.getName()); // 홍길동
//        User.applyMaskingUser(user);
//        System.out.println(user.getName()); // 홍*동

//        User user3 = user.toMaskedUser();
//        System.out.println(user3.getName());

        System.out.println(user.toMaskedUser().getName());

    }

}
