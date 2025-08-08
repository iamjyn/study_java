package com.study._19_Access.b;

import com.study._19_Access.a.AccessData;

public class OuterMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        accessData.publicMethod();
        accessData.publicField = 1;

        // default - b 패키지이기 때문에 접근 불가
        // accessData.defaultField = 2; // 컴파일러 에러

        // private - 당연히 접근 불가
    }
}
