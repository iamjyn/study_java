package com.study._08_Switch;

import java.util.Scanner;

public class WeekDiscount {
    public static void main(String[] args) {
        /*
        요일마다 할인율이 달라집니다.
        스캐너를 통해서 요일(dayOfWeek)을 입력받습니다.
        switch문을 사용하여 서로 다른 할인율을 적용해 주세요.
        월(10), 화/수/목(5), 금(15), 토/일(20)
        default -> 할인율(0)
        -최종 출력-
        오늘: ~요일
        정가: 10000원
        최종가격: ~~원
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("요일을 입력하세요 >> ");
        String dayOfWeek = scanner.nextLine();
        // "월요일" 입력하더라도 -> case "월"로 갈 수 있게 String을 가공해 주세요
        // 삼항연산자 or if
        // dayOfWeek = dayOfWeek ? :
        dayOfWeek = dayOfWeek.endsWith("요일") ? dayOfWeek : dayOfWeek + "요일";

        int basePrice = 10000;
        int discountRate; // 분기해서 초기화

        switch (dayOfWeek) {
            case "월요일": // 10
                discountRate = 10;
                break;
            case "화요일": // 5
            case "수요일":
            case "목요일":
                discountRate = 5;
                break;
            case "금요일": // 15
                discountRate = 15;
                break;
            case "토요일": // 20
            case "일요일":
                discountRate = 20;
                break;
            default:
                discountRate = 0;
                System.out.println("그런 요일은 없습니다.");
        }

        // 계산
        int discountAmount = basePrice * discountRate / 100;
        int finalPrice = basePrice - discountAmount;

        System.out.println("오늘 : " + dayOfWeek);
        System.out.println("정가 : " + basePrice + "원");
        System.out.println("최종가격 : " + finalPrice + "원");

    }
}
