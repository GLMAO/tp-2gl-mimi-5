package com.polytech.tp;

public abstract class CoursDecorator implements ICours {

    protected ICours coursDecorated;

    public CoursDecorator(ICours cours) {
        this.coursDecorated = cours;
    }

    // On délègue les méthodes de ICours au cours décoré
    @Override
    public String getDescription() {
        return coursDecorated.getDescription();
    }

    @Override
    public double getDuree() {
        return coursDecorated.getDuree();
    }
}
