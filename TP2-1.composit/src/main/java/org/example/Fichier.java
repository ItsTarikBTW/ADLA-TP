package org.example;

import java.util.Locale;

public class Fichier implements Composit {
    private String nom;
    private String access;
    private Dossier under = null;

    public Fichier(String nom, String access) {
        this.nom = nom;
        this.access = access;
    }
    public Boolean effacer() {
        if(this.access.toUpperCase().contains("D"))
            return under.childrenRemove(this);
        return false;
    }
    public void setUnder(Dossier dossier) {
        this.under = dossier;
    }

    public Boolean renommer(String nom) {
        return this.access.toUpperCase().contains("W");
    }

}
