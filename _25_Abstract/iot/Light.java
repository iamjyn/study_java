package com.study._25_Abstract.iot;

public class Light extends IoTDevice {
    public Light(String deviceId, String deviceName) {
        super(deviceId, deviceName);
    }

    @Override
    public void operate() {
        System.out.println("주광색");
    }

}
