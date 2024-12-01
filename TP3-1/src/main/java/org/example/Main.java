package org.example;

public class Main {
    public static void main(String[] args) {
        Agence agence = new Agence("Agence1");
        abonneBean abonne = new abonneBean();
        abonne.setNom("Nom1");
        abonneBean abonne2 = new abonneBean();
        abonne2.setNom("Nom2");
        abonne.setEmail("a1@example.com");
        abonne2.setEmail("a2@example.com");
        Intrest intrest1 = new Intrest("BTYBW");
        Intrest intrest2 = new Intrest("chess");
        Intrest intrest3 = new Intrest("Programming");
        Article article1 = new Article("Article1", intrest1);
        abonne.addPropertyChangeListener(intrest1);
        abonne.addPropertyChangeListener(intrest2);
        abonne.addPropertyChangeListener(intrest3);
        abonne2.addPropertyChangeListener(intrest1);
        
        System.out.println("Begin:----------------");
        abonne.addIntrests(intrest1);
        abonne.addIntrests(intrest2);
        
        abonne.setEmail("example@example.com");
        
        abonne2.addIntrests(intrest1);

        abonne.addIntrests(intrest3);
        System.out.println("----------------------");
        agence.addAbonne(abonne);
        agence.addAbonne(abonne2);
        abonne.printArticles();
        abonne2.printArticles();
        agence.addArticle(article1);
        System.out.println("--separator--");
        abonne.printArticles();
        abonne2.printArticles();
        System.out.println("End:------------------");
    }
}