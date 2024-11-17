package org.example;

public class Base2 implements Conversion {
    public String convert(String message) {
        return Integer.toBinaryString(Integer.parseInt(message));
    }
    public void update(String message) {
        System.out.println("Base2: " + convert(message));
    }
}
