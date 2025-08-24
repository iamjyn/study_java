package com.study._37_Lambda;

// 어노테이션을 선언해주면
// 컴파일러가 단일 메서드인지 아닌지 검사해준다
@FunctionalInterface
public interface Calculator {
    int calc(int a, int b);

}
