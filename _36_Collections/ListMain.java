package com.study._36_Collections;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        /*
        List (부모 클래스)
            ㄴ ArrayList: 내부에 배열을 사용해서 구현, 인덱스로 직접 접근
                        - Array의 문제점: 크기가 고정
                        - ArrayList -> 크기가 고정 x, 동적으로 늘어남
                        - 내부적으로는 T[] 사용(런타임엔 Object[])
                        - 기본크기 : 10칸
                        - 용량초과 시 기존크기 1.5배씩 확장(깊은복사)

            ㄴ linkedList: 노드들이 연결되어 있는 구조
                           장점) 중간 삽입이 빠르다(쉽다)
                           단점) 탐색식 순서대로 접근 -> ArrayList 보다 느림
        */

        // 구현체 -> 추상체 <- 구현체

        // ArrayList<String> fruits1 = new ArrayList<>(); // 크기 지정 필요없음
        List<String> fruits2 = new ArrayList<>(); // 업캐스팅

        // add(): 제일 마지막 index에 추가
        fruits2.add("사과");
        fruits2.add("바나나");
        // add(1, "포도") index 지정해서 추가
        fruits2.add(1, "포도");

        // get(index) 조회 -> getter(주소 노출방지)
        System.out.println("인덱스 0번: " + fruits2.get(0));

        // set(index, data) 수정 -> setter(주소 노출방지)
        fruits2.set(1, "키위");
        System.out.println(fruits2);

        // remove() 제거
        fruits2.remove(1); // index로 접근해서 삭제
        fruits2.remove("바나나"); // 값을 찾아서 삭제

        // size(): 길이 리턴
        System.out.println(fruits2.size());

        // contains(): 포함 여부
        System.out.println("사과 있나요? " + fruits2.contains("사과"));
    }
}
