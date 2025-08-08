package com.study._19_Access.a;

public class InnerMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        // public - 직접참조
        accessData.publicMethod();
        accessData.publicField = 1;

        // default - 같은 a 패키지 안에 있어서 접근 가능 / 직접참조 가능
        accessData.defaultMethod();
        accessData.defaultField = 2;

        // private - 다른 클래스라서 접근 불가능
        // accessData.privateField = 3; // 컴파일러 에러
        // accessData.privateMethod(); // 컴파일러 에러

        // private 필드, 메서드들은 우회해서 접근하도록 설계한다.
        accessData.innerAccess(3);

    }
}
