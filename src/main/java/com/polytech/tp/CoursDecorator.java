package com.polytech.tp;

// Classe abstraite pour le Decorator
public abstract class CoursDecorator implements ICours {
    protected ICours coursDecorated;

    public CoursDecorator(ICours cours) {
        this.coursDecorated = cours;
    }
    
    // 1. Délégation de la méthode getDescription()
    @Override
    public String getDescription() {
        return coursDecorated.getDescription();
    }
    
    // 2. Délégation de la méthode getDuree()
    @Override
    public double getDuree() {
        return coursDecorated.getDuree();
    }
}