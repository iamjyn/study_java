package com.study._30_NestedClass.nested_static;

public class Response {
    // 일정한 양식으로 서버에서 응답데이터를 반환하는 역할의 클래스
    private final static String SYSTEM_VERSION = "1.0";
    private boolean isSuccess; // 성공여부
    private Object data; // 응답데이터
    private Result result;

    public Response(boolean isSuccess, Object data, Result result) {
        this.isSuccess = isSuccess;
        this.data = data;
        this.result = result;
    }

    /*
    정적 중첩 클래스
    static으로 선언을 했기 때문에 -> 외부 클래스보다 생성 시점이 더 빠르다.
    1. Response 인스턴스 생성(new) 없이도 단독으로 사용이 가능하다.
    2. 바깥 클래스의 인스턴스필드에는 접근이 불가능하다.
    => 사실상 두 개의 서로 다른 클래스를 정의한 것과 다름이 없다.
    - 논리적으로 연관되어서 하나의 .java 파일로 관리하고 싶을 때
    - 바깥클래스(Response)가 유틸리티 클래스가 필요할 때
    참고)
    - 생명 주기가 달라도 상관 없다(inner와는 다르다)
    */

    public static class Result {
        private String massage; // 응답 메세지
        private int code; // 응답 코드(500, 404, 200...)

        public Result(String massage, int code) {
            this.massage = massage;
            this.code = code;
        }

        public void printResult() {
            // 바깥클래스의 인스턴스 private 필드에 접근 x
            // -> 내부 클래스가 static 이기 때문
            // System.out.println(isSuccess);
            // 바깥클래스의 private 이면서 static 필드는 접근 o
            System.out.println("시스템 버전: " + SYSTEM_VERSION);
            System.out.println("메세지: " + massage);
            System.out.println("코드: " + code);
        }

        // 자주 쓰는 객체를 미리 정의해서 반환
        // ex) ResponseEntity
        public static Result ok() {
            return new Result("성공", 200);
        }

        public static Result error() {
            return new Result("오류", 500);
        }


    }


}
