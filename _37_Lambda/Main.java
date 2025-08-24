package com.study._37_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> customerNames = List.of("홍길동", "박길동", "아무개", "김길동");
        // Arrays.asList("홍길동", "박길동", "아무개", "김길동");
        List<String> customerNames2 = new ArrayList<>();

        /*
        고객들 이름 뒤에 전체 "홍길동" -> "홍길동님"
        변환하여 customerNames2에 add
        */

        // 매개변수가 하나면 소괄호도 생략가능
        StringProcessor addNim = s -> s + "님";

        for (String name : customerNames) {
            String strNim = addNim.process(name);
            customerNames2.add(strNim);
        }
        System.out.println(customerNames2);

        /*
        StringChecker 인터페이스를 만들어서
        check 메서드를 선언
        반복문을 순회하면서 풀네임이 3글자 이상인 사람들만
        LongNames에 add하여 출력
        */
        List<String> names = List.of("김풍", "이순신", "홍길동", "박군", "을지문덕");
        List<String> longNames = new ArrayList<>();

        StringChecker isLongName = s -> s.length() >= 3;

        for (String name : names) {
            if (isLongName.check(name)) {
                longNames.add(name);
            }
        }

        System.out.println(longNames);




    }
}
