package com.study._37_Lambda;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data // setter, getter, toString, hashCode 오버라이딩 됨
public class Person {
    private String name;
    private int age;
}
