package com.polytech.tp;

public class CoursEnLigne extends CoursDecorator {

    // Le constructeur doit recevoir un ICours et le passer au CoursDecorator
    public CoursEnLigne(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        // On ajoute "(En ligne)" à la description du cours décoré
        return super.getDescription() + " (En ligne)";
    }

    @Override
    public double getDuree() {
        // On conserve la durée du cours décoré
        return super.getDuree();
    }
}
