package com.study._19_Access.speaker;

public class Speaker {
    private String name;
    private int volume;
    // 객체를 정의할 때 필드들의 접근제한자를
    // 특수한 경우가 아니라면 private로 제한해주는 게 권장됨

    // getter, setter
    // 전세계 국룰: getter -> private 필드값을 가져오는 public 메서드
    // 네이밍 국룰: get + 필드이름 ex) getVolume, getName
    // 전세계 국룰: setter -> private 필드값을 변경하는 public 메서드
    // 네이밍 국룰: set + 필드이름 ex) setVolume, setName

    // 생성자
    public Speaker(int volume) {
        // 초기화할 때 데이터 유효성을 검사할 수 있음
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    // private 값을 조회
    public int getVolume() {
        return this.volume;
    }

    // private 값을 변경
    public void setVolume(int volume) {
        // 초기화할 때 데이터 유효성을 검사할 수 있음
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    public void volumeUp() {
        this.volume += 10;
        if (this.volume > 100) {
            this.volume = 100;
        }
        showVolume();
    }

    public void volumeDown() {
        this.volume -= 10;
        if (this.volume < 0) {
            this.volume = 0;
        }
        showVolume();
    }

    private void showVolume() {
        System.out.println("볼륨 상태변경 감지");
        System.out.println("현재 볼륨: " + this.volume + "\n");
    }

}
