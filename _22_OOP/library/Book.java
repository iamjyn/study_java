package com.study._22_OOP.library;

import com.study._22_OOP.School;

public class Book {
    private String name; // 책이름
    private String author; // 저자 이름
    private Library library; // 하나의 책은 하나의 도서관 소속

    // Book 클래스
    // 생성자
    // setLibrary
    // printBookInfo()

    // 도서관은 빼고 초기화하는 생성자
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    // setLibrary
    // 책 -> 도서관을 알게됨(메모리 연결)
    public void setLibrary(Library library) {
        this.library = library;
    }

    // printBookInfo()
    public void printBookInfo() {
        System.out.println("책이름: " + this.name);
        System.out.println("저자: " + this.author);
        // 도서관은 우리가 정의한 객체 -> null 체크 필요하다
        // this.library == null 경우를 체크해줘야 한다.
        // null.getName() -> NullPointException
        String libraryName = this.library == null ? "없음" : this.library.getName();
        System.out.println("도서관: " + libraryName);
    }

}
