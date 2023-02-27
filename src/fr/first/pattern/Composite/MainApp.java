package fr.first.pattern.Composite;

public class MainApp {
    public static void main(String[] args) {

        Folder folder = new Folder("Root");
        Folder folder1 = new Folder("Structure");
        Folder folder2 = new Folder("Comportement");
        Folder folder3 = new Folder("Creation");

        folder.addCompasant(folder1);
        folder.addCompasant(folder2);
        folder.addCompasant(folder3);
        folder1.addCompasant(new Fichier("Composite"));
        folder1.addCompasant(new Fichier("Decorator"));

        folder2.addCompasant(new Fichier("Strategy"));
        folder3.addCompasant(new Fichier("Singeleton"));

        folder.afficher();
    }
}
