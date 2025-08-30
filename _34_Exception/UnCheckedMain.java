package com.study._34_Exception;

public class UnCheckedMain {
    // thorws가 강제되지 않음
    static int divide(int a, int b) {
        if (b == 0) {
            throw new MyUnCheckedException("0으로는 나눌 수 없습니다.");
        }
        return a / b;
    }

    // throws가 없어도 예외가 알아서 전파 된다.
    static void method() {
        divide(5, 0); // 자동 전파
    }

    public static void main(String[] args) {
        try {
            method(); // 자동으로 예외가 호출 스택을 따라 전파된다.
        } catch (MyUnCheckedException e) {
            // 강제되는 논리적인 전개는 존재하지 않음(개발자 하기 나름)
        }

        /*
        자주 접하는 언체크 예외들
        1. NullPointException : null 객체를 .으로 참조하려고 할 때
        2. ArrayIndexOutOfBoundsException : 배열 인덱스 초과시 (배열인덱스경계초과에러)
        3. ArithmeticException : 수학 오류, ex) 0으로 나누려고 할 때
        4. IllegalArgumentException : 잘못된 인자를 메서드에 전달할 때 (불법매개인자에러)
        */
    }

}
