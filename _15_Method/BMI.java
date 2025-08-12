package com.study._15_Method;

public class BMI {
    /*
    홍길동의 BMI를 구해주세요.
    키: 175, 몸무게: 70
    메서드를 구현해서 구해주세요.
    1. calcBMI(double height, double weight) : BMI 계산(return으로 double)
    bmi = 몸무게 (kg) / (키(m) * 키(m))
    2.getBMIStatus(double bmi) : BMI 상태를 리턴(return으로 String)
    18.5 미만 저체중
    18.5~24.9 정상
    25.0~29.9 과체중
    30.0 이상 비만
    */

    public static double calcBMI(double height, double weight) {
        double meterHeight = height / 100.0;
        return weight / (meterHeight * meterHeight);
    }

    public static String getBMIStatus(double bmi){
        if (bmi < 18.5) {
            return "저체중";
        } else if (bmi <= 24.9) {
            return "정상체중";
        } else if (bmi <= 29.9) {
            return "과체중";
        } else {
            return "비만";
        }
    }

    public static void main(String[] args) {
        System.out.println("-홍길동님의 건강정보-");
        double bmi = calcBMI(175, 70);
        System.out.println("1. BMI: " + bmi);
        System.out.println("2. 상태: " + getBMIStatus(bmi));
    }

}
