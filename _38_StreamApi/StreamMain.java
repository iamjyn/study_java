package com.study._38_StreamApi;

import com.study._37_Lambda.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamMain {
    /*
    Stream 객체란? : 데이터를 함수형 프로그래밍(FP) 다루기 위한 객체
    - 자바8 부터 도입
    - 특징
    1. 원본데이터는 변경되지 않음
    2. 지연 연산(Lazy)
    3. 파이프라인 구조
    */
    public static void main(String[] args) {
        // List -> Stream 화
        List<String> names = List.of("김자바", "이파이썬", "박자바");
        names.stream();
        // Array -> Stream 화
        Integer[] nums = {1, 2, 3, 4, 5, 6};
        Arrays.stream(nums);

        Arrays.stream(nums)
                .filter(n -> {
                    System.out.println("필터 실행!" + n);
                    return n % 2 == 0;
                }).map(n -> {
                    System.out.println("맵 실행!" + n);
                    return n * 10;
                });

        Arrays.stream(nums)
                .filter(n -> {
                    System.out.println("필터 실행!" + n);
                    return n % 2 == 0;
                }).map(n -> {
                    System.out.println("맵 실행!" + n);
                    return n * 10;
                }).forEach(n -> System.out.println(n));

        // 최종연산이 확정이 된 상태여야 코드를 실행
        // 1~6 전체를 메모리에 Stream 객체로 생성하는 게 아니라
        // 1을 처리하고 -> 2 -> 3.. (Lazy 연산을 수행)

        /*
        stream 파이프라인의 구성
        [리스트 or 배열] -> [스트림] -> [중간연산] * n -> [최종연산]
        1. 중간연산
            - 자기 자신을 반환(Stream 객체 반환)
            - 지연연산
            - filter(), map(), distinct(), limit(), sorted()
        2. 최종연산
            - 구체적인 겨로가를 반환(Stream 객체 반환x) -> 메서드 체이닝 불가능
            - Stream을 소모한다.
            - forEach(), collect()
        */

        // 1. filter - 조건 필터링
        // filter(Predicate<T> p)

        // Predicate<String> isKim = s -> s.startsWith("김");
        // names에서 김씨만 걸러내기
        List<String> kims = names.stream()
                .filter(s -> s.startsWith("김")) // 중간연산
                .collect(Collectors.toList()); // 최종연산

        // 2. map() - 데이터 변환
        // map(Function<T, R> fx)
        // Function<String, String> makeNim = s -> s +"님";
        List<String> nims = names.stream()
                .map(name -> name +"님")
                .collect(Collectors.toList());

        // 중간연산자 -> 체이닝 가능
        // filter를 먼저!
        // 3. distinct() - 중복제거, 함수형 인터페이스 없음
        // 4. limit(int n) - 갯수 제한, 함수형 인터페이스 없음
        List<String> kimNims = names.stream()
                .filter(name -> name.startsWith("김"))
                .distinct()
                .limit(1) // 1명만 거르겠다 - index 빠른 순
                .map(name -> name + "님")
                .collect(Collectors.toList());

        // 5. sorted() 정렬
        List<String> sortedNames = names.stream()
                .distinct()
                .sorted() // 사전순(ㄱ~ㅎ), 숫자의 경우 오름차순
                .collect(Collectors.toList());

        List<String> sortedNames2 = names.stream()
                .distinct()
                .sorted(Comparator.reverseOrder()) // 사전역순(ㅎ~ㄱ), 숫자는 내림차순
                // Comparator 객체를 전달할 수 있음
                // 1. 미리 선언된 static 객체를 전달하는 방법
                // 2. 내가 직접 오버라이딩 할 수 있음
                .collect(Collectors.toList());

        List<Person> people = List.of(
                new Person("사람1", 22),
                new Person("사람2", 30),
                new Person("사람3", 25)
        );

        // 나이 오름차순 정렬 (구현부 s2, s1으로 자리바꾸면 내림차순)
        List<Person> ageSortedPeople = people.stream()
                // Comparator를 오버라이딩
                .sorted((s1, s2) -> s1.getAge() - s2.getAge())
                // return으로 숫자가 리턴되어야 한다.
                // 결과 양수: 서로 자리를 바꿈
                // 결과 음수: 서로 자리를 바꾸지 않음
                .collect(Collectors.toList());

        // 최종연산자 - collect(), forEach()
        // forEach() - 각 요소를 소모하면서 작업을 수행
        // forEach(Consumer<T> c)
        names.stream()
                .filter(name -> name.startsWith("김"))
                .distinct()
                .limit(1) // 1명만 거르겠다 - index 빠른 순
                .map(name -> name + "님")
                .forEach(name -> System.out.println(name));


    }

}
