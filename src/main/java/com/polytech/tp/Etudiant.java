package com.polytech.tp;

// Implémenter l'interface Observer
public class Etudiant implements Observer {
    private String nom;

    public Etudiant(String nom) {
        this.nom = nom;
    }

    // Implémentation de la méthode update de l'interface Observer
    @Override
    public void update(String message) {
        System.out.println("Notification pour l'étudiant " + nom + " : " + message);
    }
    
    public String getNom() { return nom; }
}