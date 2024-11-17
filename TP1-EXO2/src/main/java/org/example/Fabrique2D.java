package org.example;

public class Fabrique2D implements FabriqueJeueur {
    public Joueur createJoueur(String type) {
        switch (type.toLowerCase()) {
            case "av":
                return new AV2D();
            case "ar":
                return new AR2D();
            case "g":
                return new G2D();
            case "d":
                return new D2D();
            default:
                throw new IllegalArgumentException("Unknown joueur type: " + type);
        }
    }
}
