package com.study._30_NestedClass.nested_inner;

public class Question {
    // 시험문제 클래스
    // 객관식 선택지(4지 선다)
    /*
    inner class
    -> 바깥 클래스의 인스턴스에 소속 됨
    -> 바깥 객체가 생성되어야 내부 객체를 생성할 수 있다.

    언제 도입하는가?
    1. 특정 클래스가 오직 하나의 클래스 필드로 사용 될 때
    - 선택지 객체는 문제 객체가 없으면 존재할 의미가 없음.
    2. 두 클래스가 긴밀하게 연관되어 생명주기가 동일할 때
    - new 시점과 stack에서 주소값 소멸의 시기가 같다.
    */

    private int questionNumber; // 문제 번호
    private String questionText; // 문제 내용
    private Choice[] choices;

    public Question(int questionNumber, String questionText) {
        this.questionNumber = questionNumber;
        this.questionText = questionText;
        this.choices = new Choice[4]; // 빈 배열
    }

    // 문제에 선택지를 추가하는 메서드
    public void addChoice(int index, String choiceText) {
        // 번호는 1부터 시작하게끔 index + 1
        choices[index] = new Choice(index + 1, choiceText);
    }

    public void printQuestion() {
        System.out.println("문제 " + questionNumber + ": " + questionText);
        System.out.println("=".repeat(50));
        // 문제1: ~올바른 것을 고르시오
        // =========================
        // 1) ---
        // 2) ---
        for (Choice choice : choices) {
            choice.printChoice();
        }
    }

    class Choice {
        private int number; // 선택지 번호
        private String text; // 선택지 내용

        private Choice(int number, String text) {
            this.number = number;
            this.text = text;
        }

        public void printChoice() {
            System.out.println(number + ") " + text);
            // 1) ~는 ~다.

            // 바깥 클래스의 private 필드 접근 가능
            // System.out.println(questionNumber);
            // System.out.println(questionText);
        }
    }

}
