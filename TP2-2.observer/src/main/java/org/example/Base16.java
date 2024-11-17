package org.example;

public class Base16 implements Conversion {
    public String convert(String message) {
        return Integer.toHexString(Integer.parseInt(message));
    }
    public void update(String message) {
        System.out.println("Base16: " + convert(message));
    }
}
