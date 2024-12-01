package org.example;

public class Article {
    private String title;
    private Intrest intrest;

    public Article(String title, Intrest intrest) {
        this.title = title;
        this.intrest = intrest;
    }

    public Intrest getIntrest() {
        return intrest;
    }

    public void setIntrest(Intrest intrest) {
        this.intrest = intrest;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Article{" + "title=" + title + '}';
    }
}
