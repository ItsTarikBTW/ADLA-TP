package org.example;

import java.util.ArrayList;

public class Dossier implements Composit {
    private String nom;
    private String access;
    private Dossier under = null;
    private ArrayList<Composit> children ;

    public Dossier(String nom, String access) {
        this.nom = nom;
        this.access = access;
        this.children = new ArrayList<Composit>();
    }
    public Boolean effacer() {
        for (Composit child : children) {
            child.effacer();
        }
        return under.childrenRemove(this);
    }
    boolean childrenRemove(Composit c) {
        return children.remove(c);
    }
    void childrenAdd(Composit c) {
        children.add(c);
        c.setUnder(this);
    }
    public Boolean renommer(String nom) {
        this.nom = nom;
        return true;
    }

    @Override
    public void setUnder(Dossier dossier) {
        this.under = dossier;
    }

    public Dossier parent() {
        return under;
    }
    public ArrayList<Composit> lister() {
        return new ArrayList<Composit>();
    }
    public Dossier cd(String nom) {
        for (Composit child : children) {
            if (child.nom.equals(nom) && child instanceof Dossier) {
                return (Dossier) child;
            }
        }
        return null;
    }
}
