package com.study._15_Method;

import java.util.Arrays;

public class Parameter {

    public static void changeNum(int number) {
        number += 2;
    }

    public static void changeArr(int[] arr) {
        arr[0] = 50;
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("changeNum 호출 전: " + num); // 10
        System.out.println(num);
        System.out.println("changeNum 호출 후: " + num); // 10

        // 자바에서 변수에 변수를 대입하는 경우
        // 변수의 값(stack에 있는 값)을 복사해서 가져간다
        /*
        --stack(main)--
        num: 10

        --stack(changeNum)--
        number: 10 -> 12
        */

        int[] nums = {20, 30, 40};
        System.out.println("changeArr 호출 전: " + Arrays.toString(nums));
        changeArr(nums);
        System.out.println("changeArr 호출 후: " + Arrays.toString(nums));
        /*
        --stack(main)--
        nums: 0x0010

        --stack(changeArr)--
        arr : 0x0010

        --heap--
        0x0010: nums 정보
        0x0014: 20 -> 50
        0x0018: 30
        0x0022: 40
        */
        // 원시자료형 -> 메서드로 원본조작이 불가능
        // 참조자료형 -> 메서드로 원본조작이 가능
    }
}
