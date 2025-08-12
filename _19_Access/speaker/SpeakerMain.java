package com.study._19_Access.speaker;

import java.util.Scanner;

public class SpeakerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("볼륨을 입력하세요 > ");
        int volume = scanner.nextInt();

        Speaker speaker = new Speaker(-100);
        speaker.volumeDown();
        speaker.volumeUp();
        // 외부로 받은 데이터가 이상해도, 유효한 데이터로 안전하게 저장 가능
        speaker.setVolume(volume);
        speaker.volumeUp();
    }
}
