package org.example;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;

public class abonneBean implements Serializable {
    private String nom;
    private String prenom;
    private String email;
    private ArrayList<Intrest> intrests;
    private ArrayList<Article> articles;
    private PropertyChangeSupport support;

    public abonneBean() {
        intrests = new ArrayList<>();
        articles = new ArrayList<>();
        support = new PropertyChangeSupport(this);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        support.firePropertyChange("email", oldEmail, email);
    }

    public ArrayList<Intrest> getIntrests() {
        return intrests;
    }

    public void addIntrests(Intrest intrest) {
        intrests.add(intrest);
        intrest.addAbonnes(this);
        support.firePropertyChange("intrests", this.intrests, intrest);
    }
    public void removeIntrests(Intrest intrest) {
        intrests.remove(intrest);
        intrest.removeAbonnes(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }
    public void printArticles() {
        System.out.println("Articles["+getNom()+"]:");
        for (Article article : getArticles()) {
            System.out.println("\t"+article);
        }
    }
    public void update(Article article) {
        addArticle(article);
        System.out.println("Article added: "+article);
    }
    public void addArticle(Article article) {
        this.articles.add(article);
    }
}