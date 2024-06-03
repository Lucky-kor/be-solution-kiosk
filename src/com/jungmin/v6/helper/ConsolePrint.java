package com.jungmin.v6.helper;

public class ConsolePrint implements Printer{

    @Override
    public void print(String str) {
        System.out.println(str);
    }
}
