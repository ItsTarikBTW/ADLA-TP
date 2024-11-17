package org.example;

public interface Composit {
    String nom = "";
    String access = "";
    Dossier under = null;

    public Boolean effacer();
    public Boolean renommer(String nom);

    void setUnder(Dossier dossier);
}
