package fr.first.pattern.Composite;

public abstract class Racine {
    protected String nom = "C:";
    protected int level;

    public Racine(String nom) {
        this.nom = nom;
    }

    public abstract void afficher();

    public String Indotation() {
        String indo = "";
        for (int i = 0; i < level; i++) {
            indo += "\t";
        }
        return indo;
    }

}
