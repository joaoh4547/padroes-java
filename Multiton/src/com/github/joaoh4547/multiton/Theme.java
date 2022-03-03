package com.github.joaoh4547.multiton;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Theme {
    private String name;
    private Color backgroundColor;
    private Color fontColor;

    private static final Map<String,Theme>  themes = new HashMap<>();

    private static final String SKY = "Sky";
    private static final String FIRE = "Fire";

    static {
        Theme theme1 = new Theme();
        theme1.setName(Theme.SKY);
        theme1.setBackgroundColor(Color.BLUE);
        theme1.setFontColor(Color.black);

        Theme theme2 = new Theme();
        theme2.setName(Theme.FIRE);
        theme2.setBackgroundColor(Color.RED);
        theme2.setFontColor(Color.WHITE);

        themes.put(theme1.getName(),theme1);
        themes.put(theme2.getName(),theme2);
    }

    private Theme(){

    }

    public Theme getInstance(String name){
        return themes.get(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Color getFontColor() {
        return fontColor;
    }

    public void setFontColor(Color fontColor) {
        this.fontColor = fontColor;
    }

}
