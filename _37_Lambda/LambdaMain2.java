package com.study._37_Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaMain2 {
    public static void main(String[] args) {
        /*
        표준 함수형 인터페이스
        - 매번 커스텀 함수형 인터페이스를 만들기 번거롭다.
        - 자유도가 높다보니 호환하기가 힘들다.
        - 자바8 부터 자주 쓰이는 패턴들을 인터페이스로 미리 제공

        // 함수형 인터페이스 리스트
        1. Function<T, R> : T를 받아서 R리턴
        - R apply(T t);
        2. Consumer<T> : T를 받아서 소비 - 리턴 x
        - void accept(T t);
        3. Supplier<T> : T를 리턴 - 매개변수 x
        - T get()
        4. Predicate<T> : T를 받아서 boolean 리턴
        - boolean test(T t)
        */

        // 인터페이스에 메서드가 단 하나 존재하기 때문에
        // 컴파일러가 추론할 수 있는 부분들은 모두 생략 가능하다.
        // 한줄로 리턴 선언이 가능하면, (중괄호 + Return) 생량 가능하다.
        // 엄밀한 개념) stringLen : 익명객체의 주소를 가지고 있음
        // 다만, 익명객체에 메서드 하나만 선언되어 있음
        // 사용할 때) stringLen : 함수를 선언하듯이 사용
        Function<String, Integer> stringLen = s -> s.length();
        System.out.println(stringLen.apply("java"));

        Consumer<String> printer = s -> System.out.println("출력: " + s);
        printer.accept("hello world!");

        Supplier<Person> personMaker = () -> new Person("김자바", 20);
        Supplier<RuntimeException> errorMaker = () -> new RuntimeException("테스트");
        Person kim = personMaker.get();
        System.out.println(kim);

        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(5));

        // Person
        List<Person> people = List.of(
                new Person("홍길동", 18),
                new Person("김자바", 22),
                new Person("이파이썬", 30),
                new Person("박리액트", 15)
        );
        // 성인만 걸러서 adults에 추가해 주세요.
        // Predicate
        List<Person> adults = new ArrayList<>();
        Predicate<Person> isAdults = p -> p.getAge() >= 20;
        for (Person p : people) {
            if (isAdults.test(p)) {
                adults.add(p);
            }
        }

        // 1. 이름이 3자 초과인 사람들만 걸러서 Predicate
        // 2. 이름 뒤에 "님"을 붙혀주세요.
        // 최종 over3Namers에 추가해 주세요.
        List<Person> over3Names = new ArrayList<>();
        Predicate<Person> isOver3Name = p -> p.getName().length() > 3;
        Function<Person, Person> addNim = p -> new Person(p.getName() + "님", p.getAge());
        Function<String, String> addNim2 = s -> s + "님";

        for (Person p : people) {
            if (isOver3Name.test(p)) {
                over3Names.add(addNim.apply(p));

                String newName = addNim2.apply(p.getName());
                over3Names.add(new Person(newName, p.getAge()));
            }
        }
        System.out.println(over3Names);



    }
}
