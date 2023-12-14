package com.designpatterns.demo.structural.adapter;

public class TextNewLineFormatter implements INewLineFormat{
    @Override
    public String formatText(String text)
    {
        String formattedText=text.replace(".","\n");
        return formattedText;
    }
}