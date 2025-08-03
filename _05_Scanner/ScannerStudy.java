package com.study._05_Scanner;

import java.util.Scanner;

public class ScannerStudy {
    public static void main(String[] args) {
        // 스캐너 - 콘솔창을 통해서 자바에 데이터를 입력받는 무언가(객체)
        // 스캐너 생성(객체 생성)
        // 지금은 외우시거나, 복붙으로 사용하자
        Scanner scanner = new Scanner(System.in);
        // 변수 전에 오는 건 자료형(Scanner)
        // 대문자로 시작하는 자료형 -> 참조자료형

        /*
        scanner.nextLine() // 문자열(한 줄 전체, 공백포함, 엔터키까지 인식해서 잘라서 읽는다)
        scanner.nextInt() // 정수를 입력받음(엔터키를 입력받지 못함)
        */

        System.out.print("문자열을 입력하세요 >> ");
        String userInput = scanner.nextLine();
        System.out.println("입력값: " + userInput);

        System.out.print("정수를 입력하세요 >> ");
        int userNum = scanner.nextInt();
        System.out.println("입력한 숫자: " + userNum);
        scanner.nextLine(); // 엔터키 처리용

        // nextInt가 처리하지 못한 엔터키(\n)가 아직 남아 있어서
        // 그 후에 오는 nextLine()이 엔터키를 읽고 바로 종료
        System.out.println("이름을 입력하세요 >> ");
        String name = scanner.nextLine();
        System.out.println("이름: " + name);

        scanner.close(); // 스캐너 종료(메모리에서 삭제 시켜준다)

    }
}
