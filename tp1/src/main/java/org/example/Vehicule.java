package org.example;

public class Vehicule {
    private Double vitesse = 0.0;
    private Double vitesseMax;
    private Double longueur;

    public Double getVitesse() {
        return vitesse;
    }

    public Double getLongueur() {
        return longueur;
    }

    public void accelerer(Double deltaV) {
        if (vitesse + deltaV > vitesseMax) {
            vitesse = vitesseMax;
        } else {
            vitesse += deltaV;
        }
    }

    public void decelerer(Double deltaV) {
        if (vitesse - deltaV < 0) {
            vitesse = 0.0;
        } else {
            vitesse -= deltaV;
        }
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "vitesse=" + vitesse +
                ", vitesseMax=" + vitesseMax +
                ", longueur=" + longueur +
                '}';
    }
}
