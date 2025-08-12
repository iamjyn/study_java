package com.study._22_OOP.library;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("자바의 정석", "자바맨");
        Book b2 = new Book("수학의 정석", "수학맨");

        Library library = new Library("알라딘");
        Service service = new Service();

        // 주소 연결 시 양방향 누락이 없게끔 설계 가능
        service.register(b1, library);
        service.register(b2, library);

        // 책 -> 도서관 주소 연결
        // b1.setlibrary(library);
        // b2.setlibrary(library);

        // 도서관 -> 책 주소 연결
        // library.addBook(b1);
        // library.addBook(b2);

        library.printAllBook();

    }
}
