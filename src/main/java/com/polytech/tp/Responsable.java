package com.polytech.tp;

// Implémenter l'interface Observer
public class Responsable implements Observer {
    private String nom;

    public Responsable(String nom) {
        this.nom = nom;
    }

    // Implémentation de la méthode update de l'interface Observer
    @Override
    public void update(String message) {
        System.out.println("Notification pour le responsable " + nom + " : " + message);
    }
    
    public String getNom() { return nom; }
}