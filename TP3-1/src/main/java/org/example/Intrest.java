package org.example;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class Intrest implements PropertyChangeListener {
    private String title;
    private ArrayList<abonneBean> abonnes;

    public Intrest() {
        abonnes = new ArrayList<>();
    }

    public Intrest(String title) {
        this.title = title;
        abonnes = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<abonneBean> getAbonnes() {
        return abonnes;
    }

    public void addAbonnes(abonneBean abonne) {
        abonnes.add(abonne);
    }

    public void updateAbonnes(String oldEmail, String email) {
        for (abonneBean abonne : abonnes)
            if (abonne.getEmail().equals(oldEmail))
                abonne.setEmail(email);
    }

    public void removeAbonnes(abonneBean abonne) {
        abonnes.remove(abonne);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("email".equals(evt.getPropertyName())) {
            System.out.println("Email changed from " + evt.getOldValue() + " to " + evt.getNewValue());
            updateAbonnes((String) evt.getOldValue(), (String) evt.getNewValue());

        } else if ("intrests".equals(evt.getPropertyName())) {
            System.out.println("New interest added: " + evt.getNewValue());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Intrest{title=").append(title).append(", abonnes=[");
        for (abonneBean abonne : abonnes) {
            sb.append(abonne.getEmail()).append(", ");
        }
        sb.append("]}");
        return sb.toString();
    }
}
