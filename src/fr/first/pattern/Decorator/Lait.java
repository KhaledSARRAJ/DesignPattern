package fr.first.pattern.Decorator;

public class Lait extends DecorateurBoisson{
    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout()+2.1;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au lait";
    }
}
