package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicule> automobile = new ArrayList<>();
        HashMap<String, Integer> besoin = new HashMap<>();
        besoin.put("bus", 3);
        besoin.put("voiture", 5);
        besoin.put("bicyclette", 2);
        besoin.put("camion", 1);
        VehiculeFactory factory = new VehiculeFactoryImpl();

        for (String type : besoin.keySet()) {
            for (int i = 0; i < besoin.get(type); i++) {
                automobile.add(factory.createVehicule(type));
            }
        }
    }
}