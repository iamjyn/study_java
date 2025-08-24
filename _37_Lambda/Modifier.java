package com.study._37_Lambda;

@FunctionalInterface
public interface Modifier<T, R> {
    R modify(T t);
}
