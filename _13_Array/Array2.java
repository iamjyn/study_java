package com.study._13_Array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        // 배열의 유틸함수(복사, 값출력, 정렬)
        int[] original = {1, 2, 3, 4, 5};

        // 메모리 주소가 출력 됨
        System.out.println(original);
        // Arrays.toString(배열) -> 배열의 내용물을 문자열로 바꿔 줌
        String strOriginal = Arrays.toString(original);
        System.out.println(strOriginal);

        // 복사 - 얕은복사, 깊은복사
        // 얕은복사 - stack에 있는 heap 메모리주소만 복사
        // 깊은복사 - heap에 있는 실제 값들도 새 메모리에 할당해서 복사
        int[] shallowCopy = original; // 얕은복사
        int[] deepCopy = Arrays.copyOf(original, original.length); // 깊은복사

        System.out.println("원본: " + Arrays.toString(original));
        System.out.println("얕복: " + Arrays.toString(shallowCopy));
        System.out.println("깊복: " + Arrays.toString(deepCopy));

        // 원본 배열 수정
        original[0] = 999;
        System.out.println("원본배열 수정 됨");

        System.out.println("원본: " + Arrays.toString(original));
        System.out.println("얕복: " + Arrays.toString(shallowCopy));
        System.out.println("깊복: " + Arrays.toString(deepCopy));

        // 정렬
        int[] nums = {8, 4, 5, 1, 7, 10};
        // 원본을 조작한 건가? yes
        // heap을 조작한 건가? yes
        Arrays.sort(nums);
        System.out.println("오름차순 정렬: " + Arrays.toString(nums));

    }
}
