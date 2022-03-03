package com.github.joaoh4547.prototype;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        String name = "Campanha X";
        Calendar dueDate = Calendar.getInstance();
        dueDate.add(Calendar.DATE,25);
        Set<String> keyWords = new HashSet<>();
        keyWords.add("Curso");
        keyWords.add("Java");

        Campaign campaign = new Campaign(name,dueDate,keyWords);
        Campaign copy = campaign.clone();
        System.out.println(campaign);
        System.out.println(copy);
    }
}
