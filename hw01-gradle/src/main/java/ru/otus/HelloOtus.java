package ru.otus;

import static com.google.common.base.MoreObjects.firstNonNull;

public class HelloOtus {

    public HelloOtus() {
    }

    public String guavaTest(){
        String first = null;
        String second = "Hello";
        return firstNonNull(first, second);
    }
}
