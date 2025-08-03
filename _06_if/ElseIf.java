package com.study._06_if;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        /*
        if ~ else if * n ~ else
        하나의 조건이 만족되면, 나머지 조건들은 검사하지 않음
        오직 하나의 코드블럭만 실행
        (코드는 위에서 아래로 읽는다.
        > 아무리 아래에 참인 else if조건이 있어도
        위에서 참인 else if가 있으면 무시 됨.)
        */

        // 스캐너 생성
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요 >> ");
        int age = scanner.nextInt();

        if (age <= 7) {
            // if문은 중첩 가능하다.
            // 권장) if문은 중첩은 2~3중을 최대로 생각하자.
            if (age < 0) {
                System.out.println("나이는 음수일 수 없습니다.");
            } else {
                System.out.println("미취학 아동입니다.");
            }
        } else if (age <= 13) { // age > 7
            System.out.println("초등학생입니다.");
        } else if (age <= 16) { // age > 7 && age > 13
            System.out.println("중학생입니다.");
        } else if (age <= 19) {
            System.out.println("고등학생입니다.");
        } else {
            System.out.println("성인입니다.");
        }

        // if ~ else if ~ else를 선언할 때
        // 숫자조건이면, 내림차순 or 오름차순으로 작성
        // 권한, 역할 같은 논리적인 데이터에서도
        // 큰 것부터 작은 순으로 혹은 작은 것부터 큰 순으로 작성

    }
}
