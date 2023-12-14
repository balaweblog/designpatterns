package com.designpatterns.demo.structural.adapter;

public class TextCSVFormatter implements ICSVFormat{
    @Override
    public String formatCsvText(String text){
        String formattedText=text.replace(".",",");
        return formattedText;
    }
}