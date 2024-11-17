package org.example;

import java.util.ArrayList;

public class ListAbonneBean {
    private ArrayList<String> intrest;
    
    public ListAbonneBean() {
        this.intrest = new ArrayList<>();
    }
    public void update(String message) {
        System.out.println("ListAbonneBean: " + message);
    }
}
