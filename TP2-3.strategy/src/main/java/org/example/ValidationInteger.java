package org.example;

public class ValidationInteger implements ValidationStrategy {
    public boolean execute(String input) {
        return input.matches("^\\d+$");
    }
}
