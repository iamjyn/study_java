package com.study._34_Exception;

// CheckedException을 만드는법 => extends Exception
public class MyCheckedException extends Exception {
    /*
    체크예외 특징:
    1. 컴파일 시점에 예외 처리 강제(try - catch를 강제)
    2. 전파시켜 주려면 throws를 강제로 명시해야함


    */

    public MyCheckedException(String message) {
        super(message);
    }
}
