package fr.first.pattern.strategy;

public class EnregistrerImplDocx implements IEregistrer{
    @Override
    public void enregistrer() {
        System.out.println("Le fichier a �t� bien :test"+".docx");
    }
}
