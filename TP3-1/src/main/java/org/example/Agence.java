package org.example;

import java.util.ArrayList;
import java.util.List;

public class Agence {
    private String nom;
    private ArrayList<abonneBean> abonnes;
    private ArrayList<Article> articles;
    public Agence(String nom) {
        this.nom = nom;
        this.abonnes = new ArrayList<>();
        this.articles = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<abonneBean> getAbonne() {
        return abonnes;
    }

    public void addAbonne(abonneBean abonne) {
        this.abonnes.add(abonne);
    }

    public void removeAbonne(abonneBean abonne) {
        this.abonnes.remove(abonne);
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }
    public void addArticle(Article article) {
        this.articles.add(article);
        notify(article);
    }
    public void removeArticle(Article article) {
        this.articles.remove(article);
    }

    public void notify(Article article) {
        ArrayList<abonneBean> abonnes = article.getIntrest().getAbonnes();
        for (abonneBean abonne : abonnes) {
            abonne.update(article);
        }
    }
}