package com.github.joaoh4547.prototype;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Campaign implements Prototype<Campaign>{
    private String name;
    private Calendar dueDate;
    private Set<String> keyWords;

    public Campaign(String name,Calendar dueDate,Set<String> keyWords){
        this.name = name;
        this.dueDate = dueDate;
        this.keyWords = keyWords;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getDueDate() {
        return dueDate;
    }

    public void setDueDate(Calendar dueDate) {
        this.dueDate = dueDate;
    }

    public Set<String> getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(Set<String> keyWords) {
        this.keyWords = keyWords;
    }

    @Override
    public Campaign clone() {
        String name = "Copia da campanha " + this.name;
        Calendar dueDate = (Calendar) this.dueDate.clone();
        Set<String> keyWords = new HashSet<>(this.keyWords);
        return new Campaign(name,dueDate,keyWords);
    }

    @Override
    public String toString() {
        SimpleDateFormat  simpleDateFormat =  new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder builder =  new StringBuilder();
        builder.append("-----------------\n");
        builder.append("Nome da campanha: ").append(this.name).append("\n");
        builder.append("Vencimento: ").append(simpleDateFormat.format(this.dueDate.getTime())).append("\n");
        builder.append("Palavras chave: \n");

        for (String keyWord: this.keyWords){
            builder.append("- ").append(keyWord).append("\n");
        }
        builder.append("-----------------\n");
        return  builder.toString();
    }
}
