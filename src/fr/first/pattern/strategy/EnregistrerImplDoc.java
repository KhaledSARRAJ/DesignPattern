package fr.first.pattern.strategy;

public class EnregistrerImplDoc implements IEregistrer{
    @Override
    public void enregistrer() {
        System.out.println("Le fichier a �t� bien :test"+".doc");
    }
}
