package org.example;

public class FabriqueRobot implements FabriqueJeueur {
    public Joueur createJoueur(String type) {
        switch (type.toLowerCase()) {
            case "av":
                return new AVRobot();
            case "ar":
                return new ARRobot();
            case "g":
                return new GRobot();
            case "d":
                return new DRobot();
            default:
                throw new IllegalArgumentException("Unknown joueur type: " + type);
        }
    }
}
