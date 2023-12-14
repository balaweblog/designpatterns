package com.designpatterns.demo.structural.adapter;

public class TexttoCSVAdapter implements INewLineFormat {
    ICSVFormat csvformatter;

    public TexttoCSVAdapter(ICSVFormat csformat) {
        this.csvformatter = csformat;
    }

    @Override
    public String formatText(String text) {
        return csvformatter.formatCsvText(text);
    }
}