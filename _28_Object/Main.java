package com.study._28_Object;

public class Main {
    public static void main(String[] args) {
        ObjectStudent student1 = new ObjectStudent("홍길동", 20);
        ObjectStudent student2 = new ObjectStudent("홍길동", 20);
        System.out.println(student1);
        System.out.println(student1.equals(student2));

        // 최상위 부모 Object 클래스
        // 메서드에서 매개변수로 Object 타입을 받으면, 모든 객체를 사용할 수 있음
        // instanceof 연산자 사용해서 다운캐스팅해서 사용하면 되는 거 아닌가?
        // 클래스를 나누는 이유가 없음 -> 권장되지 않습니다.
        // *제네릭(나중에 배울 예정)으로 구현할 수 있다.

    }
}
