package com.study._08_Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // 학점 랭킹 1등 전액, 2등 반액, 3등 상품
        // 나머지는 수고하셨습니다.
        int ranking = 3;

        // 값에 따라 분기하는 경우
        if (ranking == 1) {
            System.out.println("전액 장학금!");
        } else if (ranking == 2) {
            System.out.println("반액 장학금!");
        } else if (ranking == 3) {
            System.out.println("소정의 상품!");
        } else {
            System.out.println("수고하셨습니다.");
        }

        // switch (값을 담은 변수) {}
        switch (ranking) { // 코드라인을 이동하는 개념
            case 1: // ranking == 1 경우
                System.out.println("전액 장학금!");
                break; // break -> switch 문의 중괄호를 탈출
            case 2: // ranking == 2 경우
                // case에서는 논리연산이 불가능 (|| 사용이 불가능)
                System.out.println("반액 장학금!");
                break;
            case 3: // ranking == 3 경우
                System.out.println("소정의 상품!");
                break;
            default: // 나머지 값에 대한 분기
                System.out.println("수고하셨습니다.");
        }

        /*
        봄: 3,4,5
        여름: 6,7,8
        가을: 9,10,11
        겨울: 12,1,2
        */
        int month = 7;

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄 입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름 입니다.");
                break;
            default: // default는 가장 마지막에 적어준다.
                System.out.println("유효한 값이 아닙니다.");
        }

        // 팝콘사이즈에 따라 가격이 분기할 때
        // S, M, L, XL 사이즈마다 가격이 다르다
        Scanner scanner = new Scanner(System.in);
        System.out.print("구매하실 팝콘 사이즈를 입력(S, M, L, XL) >> ");
        String size = scanner.nextLine();
        size = size.toUpperCase(); // 대문자로 변경해서 처리

        int basePrice = 3000; // 팝콘 기본 가격
        int finalPrice; // 사이즈마다 따로 초기화

        switch (size) {
            case "S":
                finalPrice = basePrice;
                break;
            case "M":
                finalPrice = basePrice + 1000;
                break;
            case "L":
                finalPrice = basePrice + 2000;
                break;
            case "XL":
                finalPrice = basePrice + 3000;
                break;
            default:
                System.out.println("가장 작은 사이즈로 처리!");
                size = "S";
                finalPrice = basePrice;
        }

        System.out.println("사이즈: " + size);
        System.out.println("가격 : " + finalPrice + "원");

        // 참고) switch 문은 컴파일러가 if문으로 바꿔서 컴파일한다.
    }
}
