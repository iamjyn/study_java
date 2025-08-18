package com.study._25_Abstract.iot;

public class AirConditioner extends IoTDevice {
    public AirConditioner(String deviceId, String deviceName) {
        super(deviceId, deviceName);
    }

    @Override
    public void operate() {
        System.out.println("냉방");
    }
}
