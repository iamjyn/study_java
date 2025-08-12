package com.study._13_Array;

public class StackHeap {
    public static void main(String[] args) {
        // JVM 메모리(RAM)

        // stack : 용량이 작음, 한번에 빠르게 접근
        // 원시자료형의 실제 값 저장
        // 참조자료형(new로 생성된 것들)의 메모리주소(heap) 저장

        // heap : 용량이 큼, 비교적 느리게 접근
        // 참조자료형의 실제 값 저장
        // 메모리주소(heap) 저장
        // JVM이 알아서 메모리 관리/정리 (garbage collector)

        // 원시자료형 변수들
        int age = 25; // stack에 저장
        double height = 173.5; // stack
        boolean isStudent = true; // stack

        // 현재 stack의 상태:
        /*
        --stack(main)-- > 처음 저장된 값이 가장 아래로 감 (쌓임)
        isStudent : true
        height : 173.5
        age = 25

        --heap--
        비어있음
        */

        int[] scores = {85, 90, 70};
        int[] copy = scores;
        double copyHeight = height;
        String name = "홍길동";

        /*
        --stack(main)-- > 처음 저장된 값이 가장 아래로 감 (쌓임)
        name : 0x3000
        copyHeight : 173.5
        copy : 0x1000
        scores : 0x1000
        isStudent : true
        height : 173.5
        age = 25

        --heap--
        0x1000 : array에 대한 정보(길이..)
        0x1004 : 85 (int가 4바이트니까)
        0x1008 : 90
        0x100c : 70

        0x2000 : 딥카피 array에 대한 정보(길이..)
        0x2004 : 85
        0x2008 : 90
        0x200c : 70

        0x3000 : byte[] array에 대한 정보 (문자열은 array)
        0x3001 : "홍"(인코딩된 "홍") > 인코딩된 아스키코드로 됨
        0x3002 : "길"(인코딩된 "길")
        0x3003 : "동"(인코딩된 "동")
        */

    }
}
