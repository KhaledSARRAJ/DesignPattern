package fr.first.pattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Racine {
    private List<Racine> composantList = new ArrayList<>();

    public Folder(String nom) {
        super(nom);
    }

    @Override
    public void afficher() {
        String tab = Indotation();
        System.out.println(tab + "Folder" + nom);
        for (Racine c : composantList
        ) {
            c.afficher();
        }}

    public Racine addCompasant(Racine composant) {
        composant.level = this.level + 1;
        this.composantList.add(composant);
        return this;
    }

    public void removeComposant(Racine composant) {
        this.composantList.remove(composant);
    }

    public void getChild() {
        for (Racine c : composantList
        ) {
            c.afficher();
        }
    }
}
