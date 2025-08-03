package com.study._09_For;

public class NestedFor {
    public static void main(String[] args) {
        // 2중 for문

        // 한달 -> 4주
        // 한주 -> 7일
        for (int week =1; week <= 4; week++) { // 바깥 반복문 4번 반복
            System.out.println(week + "주 시작!");
            for (int day = 1; day <= 7; day++) { // 안쪽 반복문 7번 반복
                System.out.println("\t" + day + "일 살았음");
            }
            System.out.println(week + "주 끝!");
        }

    }
}
