package com.study._31_Singleton;

public class AppConfig {

    private static AppConfig instance;

    private AppConfig() {} // new를 막자!

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

}
