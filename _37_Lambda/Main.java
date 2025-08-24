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

        List<String> inputs = List.of("hello", "", "world", "", "java");
        List<String> notEmpty = new ArrayList<>();
        // StringChecker를 사용하여
        // 빈문자열이 아닌것만 notEmpty에 담아서 출력

        StringChecker isNotEmpty = s -> s.length() >= 1;
        for (String input : inputs) {
            if (isNotEmpty.check(input)) {
                notEmpty.add(input);
            }
        }
        System.out.println(notEmpty);

        List<Person> people = List.of(
                new Person("홍길동", 18),
                new Person("김자바", 22),
                new Person("이파이썬", 30),
                new Person("박리액트", 15)
        );

        // PersonChecker를 만들어서
        // 20세 이상인 Person을 찾아서 adults에 추가
        List<Person> adults = new ArrayList<>();

        PersonChecker isAdult = person -> person.getAge() >= 20;
        for (Person p : people) {
            if (isAdult.check(p)) {
                adults.add(p);
            }
        }
        System.out.println(adults);

        // 이름이 3자 초과인 사람들만 찾아서 over3Names에 추가해 주세요
        List<Person> over3Names = new ArrayList<>();

        PersonChecker hasOver3Names = person -> person.getName().length() > 3;
        for (Person p : people) {
            if (hasOver3Names.check(p)) {
                over3Names.add(p);
            }
        }
        System.out.println(over3Names);

        // names 이름의 두 번째 글자를 "*"로 마스킹하기
        Modifier<Person, Person> makeMasking = p -> {
            String name = p.getName();
            String maskedName = name.charAt(0) + "*" + name.substring(2);

            return new Person(maskedName, p.getAge());
        };

        List<Person> maskedPeople = new ArrayList<>();
        for (Person p : people) {
            maskedPeople.add(makeMasking.modify(p));
        }
        System.out.println(maskedPeople);

        // people 20세 미만 Person 객체들의 이름을 "비공개"로 바꿔 주세요
        // 바꾼 객체들을 minors에 추가해 주세요
        List<Person> minors = new ArrayList<>();

        Modifier<Integer, Person> hideMinorName = age -> {
            if (age < 20) {
                return new Person("비공개", age);
            }
            return null;
        };
        for (Person p : people) {
            Integer age = p.getAge();
            if (age > 20) {
                continue;
            }
            minors.add(hideMinorName.modify(age));
        }
        System.out.println(minors);


    }
}
