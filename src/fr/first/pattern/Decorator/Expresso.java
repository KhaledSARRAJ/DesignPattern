package fr.first.pattern.Decorator;

public class Expresso extends Boisson{

    public Expresso (){
        description="Expresso";
    }
    @Override
    public double cout() {
        return 1.20;
    }

}
