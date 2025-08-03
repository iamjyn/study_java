package com.study._03_Operator;

public class Operator4 {
    public static void main(String[] args) {
        // 논리연산자
        // &&(and 연산): 둘 다 참일 떄 참
        int age = 25;
        boolean hasLicense = true;
        // 운전가능조건 (면허 and 성인)
        boolean canDrive = (age >= 20) && hasLicense;
        System.out.println("운전 가능?: " + canDrive);

        // ||(or 연산): 둘 중 하나라도 참이면 참
        boolean isWeekend = true;
        boolean isHoliday = false;
        boolean isRest = isWeekend || isHoliday;
        System.out.println("쉬는가? : " + isRest);

        // !(not 연산): 참을 거짓으로, 거짓을 참으로 뒤집기
        boolean isOnline = true;
        boolean isOffline = !isOnline;
    }
}
