package com.study._22_OOP.library;

import com.study._22_OOP.Student;

public class Library {
    private String name; // 도서관 이름
    private Book[] books; // 하나의 도서관은 여러 개의 책을 안다
    private int bookCount; // 보관갯수, 마지막 books의 index
    private static final int MAX_BOOKS = 5;

    // Library 클래스
    // 생성자
    // addBook
    // getBook(int index)
    // printAllBook()

    // 생성자 > 초기화
    public Library(String name) {
        this.name = name;
        this.books = new Book[MAX_BOOKS];
        this.bookCount = 0;
    }

    // addBook
    public void addBook(Book book) {
        // max 초과했는지
        if (bookCount >= MAX_BOOKS) {
            System.out.println("도서관 용량이 꽉찼습니다. 등록 불가");
            return; // 리턴으로 코드 진행 막음
        }
        // 등록
        // 도서관 -> 책 알게됨(주소)
        this.books[bookCount] = book; // book 주소값
        bookCount++;
    }

    public String getName() {
        return name;
    }

    // getBook(int index)
    public Book getBook(int index) {
        if (index < 0 && index > bookCount) {
            return null;
        }
        return books[index];
    }

    // printAllBook()
    public void printAllBook() {
        // 등록된 book이 없으면 안됨
        if (bookCount == 0) {
            System.out.println("보유 도서가 없습니다.");
        } else {
            // 향상된 for문 사용 불가
            // 초기화할 때 5자리 null로 만들어놓음
            // 향상 for -> 5번 반복 (배열의 크기만큼 순회)
            for (int i = 0; i < bookCount; i++) {
                // this.books -> 배열
                // this.books[i] -> books 배열의 i번째 보관된 book 객체
                this.books[i].printBookInfo();
            }
        }
    }

}
