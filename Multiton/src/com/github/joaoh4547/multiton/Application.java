package com.github.joaoh4547.multiton;

public class Application {
    public static void main(String[] args) {
        Theme fireTheme = Theme.getInstance(Theme.FIRE);
        System.out.printf("Tema: %s%n", fireTheme.getName());
        System.out.printf("Cor da fonte %s%n", fireTheme.getFontColor());
        System.out.printf("Cor de fundo %s%n", fireTheme.getBackgroundColor());

        Theme fireTheme2 = Theme.getInstance(Theme.FIRE);

        System.out.println("--------------");
        System.out.println("Comparando as referencias");
        System.out.println(fireTheme == fireTheme2);
    }
}
