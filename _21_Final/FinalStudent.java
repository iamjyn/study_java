package com.study._21_Final;

public class FinalStudent {
    private final String name;
    private final int studentId;
    private int age;

    // final 필드는 반드시 초기화할 수 있게 생성자 정의가 강제된다.
    public FinalStudent(String name, int studentId, int age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }

    // final 필드는 setter 정의 불가능
    // public void setName(String name) {
    // this.name = name;
    // }

    // 변경이 아니기 때문에 final 이라도 getter는 정의 가능
    public String getName() {
        return this.name;
    }

    // final 파라미터: 외부에서 받은 값을 함수내에서 사용할 때, 변경하지 않겠다.
    public void printSchool(final String schoolName) {
        if (schoolName.equals("자바대학교")) {
            // schoolName = "java university"; 변경이 막혀있음
        }
    }

    public void getOld(final FinalStudent st) {
        // stack에 있는 값만 변경불가능
        st.setAge(21); // 그래서 st의 주소가 바뀌지 않으면 가능하다.
    }

    // age 필드는 fianl x -> setter 가능
    public void setAge(int age) {
        this.age = age;
    }

}
