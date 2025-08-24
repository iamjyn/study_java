package com.study._36_Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        // key로 value들을 관리
        // key는 중복 허용하지 않는다.
        // value는 중복이 가능하다.
        // key로 value에 접근할 때 속도가 매우 빠름

        // 학생점수를 관리하는 Map
        Map<String, Integer> studentMap = new HashMap<>(); // 업캐스팅

        // 저장 put()
        studentMap.put("김자바", 90);
        studentMap.put("이파이썬", 85);
        studentMap.put("박스프링", 92);

        // 조회 get(key)
        System.out.println("김자바 성적: " + studentMap.get("김자바"));
        // 존재하지 않는 key면 null 반환
        System.out.println("김자바 성적: " + studentMap.get("킴자바"));

        // 수정
        studentMap.put("김자바", 100); // 덮어쓰기

        // 제거
        studentMap.remove("김자바");
        System.out.println(studentMap);

        // Map과 for문
        // 1) keySet() 사용 -> 키를 통해 순회
        Set<String> names = studentMap.keySet();
        for (String name : names) {
            System.out.println(name + ": " + studentMap.get(name));
        }

        // 2) entrySet() -> key-value 쌍으로 순회
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String name = entry.getKey();
            Integer score = entry.getValue();
            System.out.println(name + ": " + score);
        }

    }

}
