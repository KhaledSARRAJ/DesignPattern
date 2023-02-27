package fr.first.pattern.Decorator;

public class Chocolat extends DecorateurBoisson{
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout()+3.1;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au chocolat";
    }
}
