package com.github.com.joaoh4547.singleton;

public class Application {
    public static void main(String[] args) {
        Configuration configuration = Configuration.getInstance();
        String timeZone = configuration.getProperty("currency-code");
        System.out.println(timeZone);
    }
}
