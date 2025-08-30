package com.study._33_Enum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Enum으로 부터 상속받은 메서드
        // values(): 모든 Enum 인스턴스들을 배열로 반환
        Grade[] values = Grade.values();
        System.out.println("values: " + Arrays.toString(values));

        // String -> Enum 객체화
        Grade gold = Grade.valueOf("GOLD");
        System.out.println(gold == Grade.GOLD); // true

        // Enum -> String 화
        String goldName = Grade.GOLD.name();
        System.out.println(goldName); // "GOLD"

        // DB에서 가져온 데이터(String) -> Enum으로 변환(Enum은 자바에만 있음)
        /*
        public class DBUser {
            private String grade;
        }
        public class User {
            private Grade grade;
        }
        Grade userGrade = Grade.valueOf(user.getGrade());
        // 단점: class가 많아진다. 복잡도가 증가한다.
        // 장점: user.getGrade() 값이 Enum에 없는 인스턴스라면
        // 미리 컴파일시점에 정확히 어디서 에러가 발생하는지 알 수 있다.
        */

        // Enum도 클래스이니까 인스턴스 메서드 선언/사용 가능
        int price = 100000;
        int basicPrice = Grade.BASIC.discount(price);
        int goldPrice = Grade.GOLD.discount(price);
        int diamondPrice = Grade.DIAMOND.discount(price);

    }
}
