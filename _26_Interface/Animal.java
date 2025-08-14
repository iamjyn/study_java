package com.study._26_Interface;

public interface Animal {
    // 모든 메서드가 자동으로 abstract가 붙는다.
    // 모든 메서드가 자동으로 public이 붙는다.
    // public abstract -> 생략가능
    // public abstract void sound();

    void sound();
    void move();


}
