package org.example;

import java.util.ArrayList;

public class Console {
    private ArrayList<Conversion> conversions;

    public Console() {
        this.conversions = new ArrayList<>();
    }
    public void addConversion(Conversion conversion) {
        this.conversions.add(conversion);
    }
    public void netify(String message) {
        for (Conversion conversion : this.conversions) {
            conversion.update(message);
        }
    }
    public void message(String message) {
        System.out.println("====================");
        System.out.println("observer :" + message);
        netify(message);
        System.out.println("====================");
    }
}
