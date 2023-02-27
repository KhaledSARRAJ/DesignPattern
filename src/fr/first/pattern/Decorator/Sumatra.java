package fr.first.pattern.Decorator;

public class Sumatra extends Boisson{

    public Sumatra(){
        description="Sumatra";
    }
    @Override
    public double cout() {
        return 2.30;
    }

}
