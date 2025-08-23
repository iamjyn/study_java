package com.study._34_Exception;

// 언체크 예외 만드는법 => extends RuntimeException
public class MyUnCheckedException extends RuntimeException {
    public MyUnCheckedException(String message) {
        super(message);
    }
}
