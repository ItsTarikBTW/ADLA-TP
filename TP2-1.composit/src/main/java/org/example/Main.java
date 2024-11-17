package org.example;

public class Main {
    public static void main(String[] args) {

        Dossier root = new Dossier("root", "CRUD");
        Dossier home = new Dossier("home", "CRUD");
        Dossier TP = new Dossier("TP", "CRUD");
        Fichier tp1 = new Fichier("tp1.java", "CRUD");
        Fichier tp2 = new Fichier("tp2.java", "CRUD");

        TP.childrenAdd(tp1);
        TP.childrenAdd(tp2);

        home.childrenAdd(TP);

        root.childrenAdd(home);

    }
}