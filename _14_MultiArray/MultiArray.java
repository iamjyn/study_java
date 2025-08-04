package com.study._14_MultiArray;

public class MultiArray {
    public static void main(String[] args) {
        /*
        다차원 배열
        - 1차원 배열에 차원이 더 추가된 배열 [[], [], []]
        - 2차원 배열은 행(row)과 열(column)으로 구성되어 있다고 일반화 가능
            - (x,y)좌표, 엑셀 등을 다루기 편함
        */

        // 영화관 좌석
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        // 2차원 배열 선언/초기화
        String[][] seats = new String[][]{
                seatA, seatB, seatC
        };

        // 데이터 접근
        // seats의 seatA에 접근
        String[] aRow = seats[0]; // seatA
        // seats의 seatA의 "A3"
        String a3 = seats[0][2]; // seatA "A3"
        a3 = aRow[2];

        // "C4"
        String c4 = seats[2][3];

        /*
        String[][] = seats = new String[][]{seatA, seatB, seatC}

        --stack(main)--
        seats: 0x1000

        --heap--
        0x1000: 배열에 대한 정보
        0x1002: 0x2000 -> seatA의 배열 주소
        0x1004: 0x3000 -> seatB의 배열 주소
        0x1006: 0x4000 -> seatC의 배열 주소

        0x2000: seatA 배열의 정보
        0x2004: "A1"의 주소
        ...
        0x2020: "A5"의 주소
        */

        // for 문으로 탐색하려면?
        for (String[] row : seats) { // 큰 서랍
            for (String seat : row) { // 큰 서랍 안에 내부 서랍 순회
                System.out.print(seat + " ");
            }
            System.out.println();
        }

    }
}
