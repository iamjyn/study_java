package com.study._36_Collections;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    /*
    Set은 추상체(인터페이스) -> HashSet
    데이터(객체, 원시자료형..) -> 알고리즘으로 가공 -> 숫자
    - 데이터와 숫자는 1:1 대응
    - 따라서, 중복을 허용하지 않음
    - 순서가 없습니다.(index가 존재하지 않음)
    - null도 하나만 허용
    - Map 자료구조의 key가 Hash로 구현되어 있음

    사용시기
    - 중복제거용으로 사용
    - 순서가 중요하지 않은 데이터
    - 검색이 빠르다.(1:1 대응이라서) - 0(1)
    */

    public static void main(String[] args) {
        Set<String> set = new HashSet<>(); // 업캐스팅

        set.add("banana");
        set.add("apple");
        set.add("cherry");
        set.add("apple"); // 중복
        set.add("apple"); // 중복

        System.out.println(set);
        System.out.println(set.size()); // 크기

        // contains() - 검색(빠르다)
        System.out.println("apple 있나요? " + set.contains("apple"));

        // remove() - 제거(빠르다)
        boolean isRemove = set.remove("banana");

        // index 기반 자료구조 ex) Array, List
        // index로 접근해서 검색, 삭제 -> 빠름(1:1 대응이기 때문)
        // 값으로 검색, 삭제 -> 느리다(순회하면서 찾아야하기 때문)

        // 완전 랜덤은 아니고, 특정 알고리즘에 의해 계산된 순서
        // 입력순서가 보장x
        System.out.println(set);

        // 집합연산
        Set<String> follower = new HashSet<>();
        follower.add("홍길동");
        follower.add("김철수");
        follower.add("박영희");

        Set<String> following = new HashSet<>();
        following.add("고길동");
        following.add("홍길동");
        following.add("김길동");

        // 합집합
        Set<String> union = new HashSet<>(follower);
        union.addAll(following); // set, ArrayList 등도 대입가능

        // 교집합
        Set<String> intersection = new HashSet<>(follower);
        intersection.retainAll(following); // 중복요소들만 남김

        // 차집합
        Set<String> difference = new HashSet<>(follower);
        difference.removeAll(following); // 기존요소에서 중복부분만 제거

        System.out.println(union);
        System.out.println(intersection);
        System.out.println(difference);


    }

}
