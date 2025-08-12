package com.study._22_OOP.library;

public class Service {
    // 객체끼리 중재, 관계를 연결하는 책임을 가지는 클래스

    // 책 -> 도서관 주소연결
    // 도서관 -> 책 주소연결
    public void register(Book book, Library library) {
        // null 체크
        if (book == null || library == null) {
            System.out.println("책 혹은 도서관이 존재하지 않습니다.");
            return;
        }

        // 양방향 관계 설정(서로 주소 넘겨줌)
        book.setlibrary(library);
        library.addBook(book);

    }


}
