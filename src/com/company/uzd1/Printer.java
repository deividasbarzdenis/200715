package com.company.uzd1;

public class Printer {
    public static <T> void print(T[] a){
        for (T t : a) {
            System.out.print(t + " ");
        }
    }
}
