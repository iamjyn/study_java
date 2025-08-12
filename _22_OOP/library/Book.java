package com.study._22_OOP.library;

import com.study._22_OOP.School;

public class Book {
    private String name; // 책이름
    private String author; // 저자 이름
    private Library library; // 하나의 책은 하나의 도서관 소속

    // setLibrary
    // printBookInfo()

    // 도서관은 빼고 초기화하는 생성자
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    // 책 -> 도서관 알게됨(주소)
    public void setlibrary(Library library) {
        this.library = library;
    }

    public void printInfo() {
        System.out.println("제목: " + this.name);
        System.out.println("저자: " + this.author);
        // 도서관은 우리가 정의한 객체 -> null 체크 필요하다
        // this.library == null 경우를 체크 해줘야 한다.
        // null.getName() -> NullPointException
        String libraryName = this.library == null ? "없음" : library.getName();
        System.out.println("도서관: " + libraryName);
    }

}
