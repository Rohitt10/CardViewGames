package com.example.cardviewdemo;

public class Games {
    private int image;
    private String text;
    Games(String text,int image)
    {
        this.text=text;
        this.image=image;
    }

    public int getImage() {
        return image;
    }

    public String getText() {
        return text;
    }
}
