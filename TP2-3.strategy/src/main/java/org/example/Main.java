package org.example;

public class Main {
    public static void main(String[] args) {

        Validater validater = new Validater("12", new ValidationInteger());
        System.out.println(validater.validate());

        validater.setStrategy(new ValidationEmail());
        System.out.println(validater.validate());

        Validater validater1 = new Validater("tarik@exemple.com", new ValidationEmail());
        System.out.println(validater1.validate());
    }
}