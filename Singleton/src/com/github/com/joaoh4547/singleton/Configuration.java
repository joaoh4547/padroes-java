package com.github.com.joaoh4547.singleton;

import java.util.HashMap;
import java.util.Map;

public class Configuration {

    private static Configuration instance;

    private final Map<String,String> properties;

    private Configuration(){
        this.properties = new HashMap<>();
        this.properties.put("time-zone","America/SAO_PAULO");
        this.properties.put("currency-code","BRL");

    }

    public static Configuration getInstance() {
        if (instance == null){
            instance = new Configuration();
        }
        return instance;
    }

    public String getProperty(String name) {
        return properties.get(name);
    }
}
