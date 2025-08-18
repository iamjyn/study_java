package com.study._25_Abstract.iot;

public abstract class IoTDevice {
    protected String deviceId;
    protected String deviceName;
    protected boolean isPowerOn;

    public IoTDevice(String deviceId, String deviceName) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.isPowerOn = false;
    }

    public abstract void operate();

    public void powerOn() {
        System.out.println(deviceName + "전원 ON");
        isPowerOn = true;
    }

    public void powerOff() {
        System.out.println(deviceName + "전원 OFF");
        isPowerOn = false;
    }

}
