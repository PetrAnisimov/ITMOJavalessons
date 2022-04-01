package ru.itmo.lessons.lesson12;

import java.util.Arrays;

public class Storage {
    private String[] strings;
    private int lastIndex;


    public Storage(int len) {
        if (len < 1) {
            throw new IllegalArgumentException("Задайте размер массива");
        }
        strings = new String[len];
    }

    public void addString(String newString) {
        if (lastIndex == strings.length) {
            return;
        }
        strings[lastIndex] = newString;
        lastIndex += 1;
    }


    @Override
    public String toString() {
        return "Storage{" +
                "strings=" + Arrays.toString(strings) +
                '}';
    }
}