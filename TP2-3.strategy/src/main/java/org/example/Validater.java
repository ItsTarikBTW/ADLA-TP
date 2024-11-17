package org.example;

public class Validater {
    private String input;
    ValidationStrategy strategy;

    public Validater(String input, ValidationStrategy strategy) {
        this.input = input;
        this.strategy = strategy;
    }
    public void setStrategy(ValidationStrategy strategy) {
        this.strategy = strategy;
    }
    public boolean validate() {
        return strategy.execute(input);
    }
}
