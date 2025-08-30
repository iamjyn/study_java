package com.study._30_NestedClass.nested_static;

public class Main {
    public static void main(String[] args) {
        // 정적 중첩 클래스 객체는 바깥 객체 없이도 단독 생성 가능
        // Result 클래스는 Response 인스턴스 없이 생성 가능

        // (보통 new를 직접 생성하지 않음)
        Response.Result result1 = new Response.Result("데이터 조회 성공", 200);
        Response.Result result2 = new Response.Result("권한 없음", 403);

        // 정적 메서드 활용 (유틸리티 성)
        Response.Result ok = Response.Result.ok();
        Response.Result error = Response.Result.error();

        ok.printResult();
        error.printResult();

    }
}
