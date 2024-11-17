package org.example;

public class Base8 implements Conversion {
    public String convert(String message) {
        return Integer.toOctalString(Integer.parseInt(message));
    }
    public void update(String message) {
        System.out.println("Base8: " + convert(message));
    }
}
