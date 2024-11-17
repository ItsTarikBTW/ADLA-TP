package org.example;

public class Fabrique3D implements FabriqueJeueur {
    public Joueur createJoueur(String type) {
        switch (type.toLowerCase()) {
            case "av":
                return new AV3D();
            case "ar":
                return new AR3D();
            case "g":
                return new G3D();
            case "d":
                return new D3D();
            default:
                throw new IllegalArgumentException("Unknown joueur type: " + type);
        }
    }
}
