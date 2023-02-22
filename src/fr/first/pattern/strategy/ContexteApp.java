package fr.first.pattern.strategy;

public class ContexteApp {
    private IEregistrer iEregistrer;


    public void process(){
        System.out.println("Début de l'enregistrement");
        iEregistrer.enregistrer();
        System.out.println("Fin de l'enregistrement");
    }

    public void setiEregistrer(IEregistrer iEregistrer) {
        this.iEregistrer = iEregistrer;
    }
}
