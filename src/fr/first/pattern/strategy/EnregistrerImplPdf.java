package fr.first.pattern.strategy;

public class EnregistrerImplPdf implements IEregistrer{
    @Override
    public void enregistrer() {
        System.out.println("Le fichier a �t� bien :test"+".pdf");
    }
}
