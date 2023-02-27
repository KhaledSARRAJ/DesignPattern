package fr.first.pattern.Decorator;

public abstract class DecorateurBoisson extends Boisson{
    protected Boisson boisson;

    public DecorateurBoisson(Boisson boisson) {
        this.boisson = boisson;
    }
    public abstract String getDescription();
}
