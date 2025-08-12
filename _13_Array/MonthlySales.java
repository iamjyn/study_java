package com.study._13_Array;

public class MonthlySales {
    public static void main(String[] args) {
        // 월별 매출
        int[] monthlySales = {
                1200, 1350, 1100, 1500, 1800, 2100,
                2300, 2200, 1900, 1600, 1400, 1650
        };
        String[] months = {
                "1월", "2월","3월","4월","5월","6월",
                "7월", "8월","9월","10월","11월","12월"
        };
        // 1. 최고 매출 금액이 얼마인가? / 해당 월은 몇 월인가?

        int maxSales = monthlySales[0]; // 초기화 - 0번부터 비교시작
        int maxIndex = 0; // 초기화 - 0번부터 비교시작
        for (int i = 1; i < monthlySales.length; i++) {
            if (monthlySales[i] > maxSales) { // i번째 매출이 최고 매출보다 크면
                maxSales = monthlySales[i]; // 최고 매출을 업데이트 하라
                maxIndex = i; // 최고 매출이 저장되어 있는 인덱스도 업데이트 하라
            }
        }
        System.out.println("최고 매출: " + maxSales + "만원\n해당 월: " + months[maxIndex]);

        // 2. 연평균 매출 계산
        // 전체 합 / monthlySales.length
        int totalSum = 0;
        for (int sale : monthlySales) {
            totalSum += sale; // 각 월의 누계합
        }
        double average = (double) totalSum / monthlySales.length;
        System.out.println("연평균: " + average + "만원");

    }
}
