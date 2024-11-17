package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Terrain {
    private ArrayList<Joueur> joueurs = new ArrayList<>();
    private HashMap<String, Integer> besoin;
    private FabriqueJeueur factory;

    public Terrain(FabriqueJeueur factory, HashMap<String, Integer> besoin) {
        this.factory = factory;
        this.besoin = besoin;
    }

    public void spawnJoueurs() {
        for (String type : besoin.keySet()) {
            for (int i = 0; i < besoin.get(type); i++) {
                joueurs.add(factory.createJoueur(type));
            }
        }
    }

    public ArrayList<Joueur> getTerrain() {
        return joueurs;
    }
}