package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> besoin = new HashMap<>();
        besoin.put("av", 3);
        besoin.put("ar", 5);
        besoin.put("d", 2);
        besoin.put("g", 1);
        FabriqueJeueur factory;

        // Get client input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2D, 3D, or Robot");
        String input = sc.nextLine();

        if (input.equals("2D")) {
            factory = new Fabrique2D();
        } else if (input.equals("3D")) {
            factory = new Fabrique3D();
        } else if (input.equals("Robot")) {
            factory = new FabriqueRobot();
        } else {
            throw new IllegalArgumentException("Unknown joueur type: " + input);
        }

        Terrain terrain = new Terrain(factory, besoin);
        terrain.spawnJoueurs();
    }
}