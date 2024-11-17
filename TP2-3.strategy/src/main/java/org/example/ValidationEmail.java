package org.example;

public class ValidationEmail implements ValidationStrategy {
    public boolean execute(String input) {
        return input.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
    }
}
