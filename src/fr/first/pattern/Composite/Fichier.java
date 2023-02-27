package fr.first.pattern.Composite;

public class Fichier extends Racine {
    public Fichier(String nom) {
        super(nom);
    }

    @Override
    public void afficher() {
        String tab = Indotation();
        System.out.println(tab+"File:"+nom);
    }
}
