package com.study._20_Static;

public class StaticMain {
    public static void main(String[] args) {
        StaticData data1 = new StaticData(1);
        StaticData data2 = new StaticData(2);
        StaticData data3 = new StaticData(3);

        System.out.println(data1.count); // 1
        System.out.println(data2.count); // 1
        System.out.println(data3.count); // 1
        // count는 인스턴스 변수이므로 각 객체마다 따로 존재
        // 각 객체가 생성될 때 각자 0 -> 1 증가

        System.out.println(StaticData.instanceCount); // 3 권장(클래스이름으로 접근)
        System.out.println(data1.instanceCount); // 3 비권장(인스턴스로는 접근)
        // instanceCount는 static 변수
        // StaticData 클래스에서 하나만 존재하며 모든 인스턴스가 공유
        // 생성자가 호출될 때 마다 0 -> 1 -> 2 -> 3 증가

    }
}
