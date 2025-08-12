package com.study._19_Access.bottle;

public class Test {
    private int a;
    private int b;
    private String c;
    private String d;

    // getter, setter 선언
    // 생성자 선언 -> 기본생성자 + 전체필드 초기화 생성자
    // 보일러 플레이트(boiler plate) 코드

    public Test() {
    }

    public Test(int a, int b, String c, String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }
}
