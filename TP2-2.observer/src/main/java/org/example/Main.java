package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input ="";
        Console console = new Console();

        Conversion base2 = new Base2();
        Conversion base8 = new Base8();
        Conversion base16 = new Base16();

        console.addConversion(base2);
        console.addConversion(base8);
        console.addConversion(base16);

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter a number: ");
                input = String.valueOf(scanner.nextInt());
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                console.message(input);
            }
        }

    }
}