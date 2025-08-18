package com.study._25_Abstract.iot;

public class IoTManager {
    private IoTDevice[] devices;

    public void powerOnAll() {
        System.out.println("모든 기기 전원을 켭니다");
        for (IoTDevice device : devices) {
            device.powerOn();
        }
    }
}
